package com.bftcom.iis.camel.config;

import com.bftcom.iis.camel.model.Session;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import java.util.ArrayList;
import java.util.HashMap;

public class TrainProcessor implements Processor {
    @Override
    public void process(Exchange exchange) throws Exception {
        final var data = (ArrayList) exchange.getIn().getBody();
        if (!data.isEmpty()) {
            final var dataMap = new HashMap<>(1);
            dataMap.put("dtRecieved", ((Session) data.get(0)).getDtRecieved());
            exchange.getIn().setBody(dataMap);
        } else {
            exchange.getIn().setHeader("notFound", true);
        }
    }
}
