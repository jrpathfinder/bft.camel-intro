package com.bftcom.iis.camel.config;

import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerRouteBuilder extends RouteBuilder {

    private static final String KAFKA_CONFIG = "kafka:getDateTopic?brokers=localhost:29092";

    @Override
    public void configure() throws Exception {

        from("direct:kafka-producer")
                .routeId("Kafka Producer route")
                .process(new KafkaProcessor())
                .marshal()
                .protobuf()
                .to(KAFKA_CONFIG)
                .setHeader(Exchange.HTTP_RESPONSE_CODE, constant(201))
                .setBody(exchangeProperty("guid"));
    }
}
