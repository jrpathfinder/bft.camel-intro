package com.bftcom.iis.camel.config;

import com.bftcom.iis.camel.model.InputPojo;
import lombok.extern.slf4j.Slf4j;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class RestRouteBuilder extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        restConfiguration()
                .component("servlet")
                .bindingMode(RestBindingMode.auto);

        rest().get("/get-guid-by-date")
                .routeId("Get GUID by date")
                .type(InputPojo.class)
                .to("direct:kafka-producer");

        rest().get("/get-trains-by-guid")
                .routeId("Get trains by GUID")
                .to("direct:sql_select");

    }
}
