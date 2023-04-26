package com.bftcom.iis.camel.config;

import lombok.extern.slf4j.Slf4j;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Service;


@Slf4j
@Service
public class JpaRouteBuilder extends RouteBuilder {

    @Override
    public void configure() throws Exception {

        from("direct:sql_select")
                .process(exchange -> {
                    log.info(exchange.getIn().getBody().toString());
                    final var guid = exchange.getIn().getHeader("guid");
                    exchange.setProperty("guid", guid);
                })
                .toD("jpa:com.bftcom.iis.camel.model.Session?resultClass=com.bftcom.iis.camel.model.Session&nativeQuery=select * from habrdb.sessionz where guid = '${header.guid}'")
                .log(">>> ${body}")
                .to("direct:sql_test_train")
        ;
    }
}
