package com.bftcom.iis.camel.config;

import com.bftcom.iis.camel.model.Train;
import lombok.extern.slf4j.Slf4j;
import org.apache.camel.CamelContext;
import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.builder.ThreadPoolBuilder;
import org.apache.camel.impl.DefaultCamelContext;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutorService;

@Slf4j
@Service
public class TrainJpaRouteBuilder extends RouteBuilder {
    // create a thread pool builder
    CamelContext context = new DefaultCamelContext();
    ThreadPoolBuilder builder = new ThreadPoolBuilder(context);
    // use thread pool builder to create a custom thread pool
    ExecutorService executorService = builder.poolSize(5).maxPoolSize(25).maxQueueSize(200).build("MyPool");

    public TrainJpaRouteBuilder() throws Exception {
    }

    @Override
    public void configure() throws Exception {
        from("direct:sql_test_train")
                .process(new TrainProcessor())
                .choice()
                .when(header("notFound").isEqualTo(true))
                .setHeader(Exchange.HTTP_RESPONSE_CODE, constant(201)).setBody(constant("Item not found"))
                .otherwise()
                .toD("jpa:com.bftcom.iis.camel.model.Train?nativeQuery=select * from habrdb.test where dt_start > TO_TIMESTAMP('${header.dtRecieved}','YYYY-MM-DD HH:MI:SS')&resultClass=com.bftcom.iis.camel.model.Train")
                .split(body(), new MyAggregateStrategy())
                .parallelProcessing()
                .executorService(executorService)
                .process(exchange -> {
                    log.info(exchange.getIn().getBody().toString());
                    Train train = exchange.getIn().getBody(Train.class);
                    train.setTrainName(train.getTrainName().toUpperCase());
                    exchange.getIn().setBody(train);
                })
                .log(">>> ${body} - ${threadName}")
                .setHeader(Exchange.HTTP_RESPONSE_CODE, constant(201));
    }
}
