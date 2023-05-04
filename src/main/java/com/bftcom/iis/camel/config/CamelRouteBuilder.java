package com.bftcom.iis.camel.config;

import com.bftcom.iis.camel.generated.IisMsgProtos;
import lombok.extern.slf4j.Slf4j;
import org.apache.camel.CamelContext;
import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.builder.ThreadPoolBuilder;
import org.apache.camel.component.sql.SqlComponent;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedCaseInsensitiveMap;

import javax.sql.DataSource;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

@Service
@Slf4j
public class CamelRouteBuilder extends RouteBuilder {

    private static final String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
    @Autowired
    DataSource dataSource;

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Bean
    public SqlComponent sql(DataSource dataSource) {
        SqlComponent sql = new SqlComponent();
        sql.setDataSource(dataSource);
        return sql;
    }

    @Override
    public void configure() throws Exception {

        restConfiguration()
                .component("servlet")
                .bindingMode(RestBindingMode.auto);

        rest().get("/get-date")
                .routeId("GET date")
                .to("direct:kafka-producer");

        from("direct:kafka-producer")
                .routeId("Kafka Producer")
                .process(exchange -> {
                    log.info("Send request message to Kafka {}", exchange.getIn().getBody());
                    final var inputDto = (LinkedHashMap) exchange.getIn().getBody();
                    final var dtRecieved = (String) inputDto.get("date");
                    final var ip = (String) exchange.getIn().getHeader("ip");
                    final var dtCreated = LocalDateTime.now();
                    final var fmt = DateTimeFormatter.ofPattern(DATE_FORMAT);
                    exchange.getIn().setBody(IisMsgProtos.RequestMsg.newBuilder()
                            .setDtrecieved(dtRecieved)
                            .setDtsend(dtCreated.format(fmt))
                            .setIp(ip)
                            .build());
                })
                .marshal()
                .protobuf()
                .to("kafka:getDateTopic?brokers=localhost:29092").to("direct:kafka-get");

        from("direct:kafka-get")
                .to("kafka:getDateTopic?brokers=localhost:29092")
                .routeId("Kafka Consumer")
                .unmarshal()
                .protobuf("com.bftcom.iis.camel.generated.IisMsgProtos$RequestMsg")
                .log("Message received from Kafka : ${body}")
                .to("direct:sql_test");

        // create a thread pool builder
        CamelContext context = new DefaultCamelContext();
        ThreadPoolBuilder builder = new ThreadPoolBuilder(context);

        // use thread pool builder to create a custom thread pool
        ExecutorService executorService = builder.poolSize(5).maxPoolSize(25).maxQueueSize(200).build("MyPool");

        from("direct:sql_test")
                .process(exchange -> {
                    final var requestMsg = (IisMsgProtos.RequestMsg) exchange.getIn().getBody();
                    final var dataMap = new HashMap<>(4);
                    dataMap.put("dtRecieved", requestMsg.getDtrecieved());
                    exchange.getIn().setBody(dataMap);
                })
                .to("sql:select * from habrdb.test where dt_start > TO_TIMESTAMP(:#dtRecieved,'YYYY-MM-DD HH:MI:SS')")
                .split(body(), new MyAggregateStrategy())
                .parallelProcessing()
                .executorService(executorService)
                .process(exchange -> {
                    log.info(exchange.getIn().getBody().toString());
                    Map<String, String> dataMap = (LinkedCaseInsensitiveMap) exchange.getIn().getBody();
                    dataMap.put("train_name", Objects.requireNonNull(dataMap.get("train_name")).toUpperCase());
                    exchange.getIn().setBody(dataMap);
                })
                .log(">>> ${body} - ${threadName}")
                .setHeader(Exchange.HTTP_RESPONSE_CODE, constant(201));
    }
}
