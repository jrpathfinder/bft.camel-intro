package com.bftcom.iis.camel.config;

import com.bftcom.iis.camel.generated.IisMsgProtos;
import com.bftcom.iis.camel.model.Session;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
public class KafkaConsumerRouteBuilder extends RouteBuilder {

    private static final String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
    @Override
    public void configure() throws Exception {
        from("kafka:getDateTopic?brokers=localhost:29092")
                .routeId("Kafka Consumer")
                .unmarshal()
                .protobuf("com.bftcom.iis.camel.generated.IisMsgProtos$RequestMsg")
                .log("Message received from Kafka : ${body}")
                .process(exchange -> {
                    final var requestMsg = (IisMsgProtos.RequestMsg) exchange.getIn().getBody();
                    exchange.getIn().setBody(new Session()
                            .setGuid(requestMsg.getGuid())
                            .setIp(requestMsg.getIp())
                            .setDtRecieved(LocalDateTime.parse(requestMsg.getDtrecieved(), DateTimeFormatter.ofPattern(DATE_FORMAT)))
                            .setDtSend(LocalDateTime.parse(requestMsg.getDtsend(), DateTimeFormatter.ofPattern(DATE_FORMAT))));
                })
                .to("jpa:com.bftcom.iis.camel.model.Session?usePersist=true");
    }
}
