package com.bftcom.iis.camel.config;

import lombok.extern.slf4j.Slf4j;
import org.apache.camel.AggregationStrategy;
import org.apache.camel.Exchange;

@Slf4j
public class MyAggregateStrategy implements AggregationStrategy {
    @Override
    public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {
        if (oldExchange == null) {
            // the first time we aggregate we only have the new exchange,
            // so we just return it
            return newExchange;
        }

        String agLines = oldExchange.getIn().getBody(String.class);
        String newLine = newExchange.getIn().getBody(String.class);

        log.debug("Aggregate old : " + agLines);
        log.debug("Aggregate new : " + newLine);

        // put lines together separating by semicolon
        agLines = agLines + ";" + newLine;
        // put combined line back on old to preserve it
        oldExchange.getIn().setBody(agLines);

        // return old as this is the one that has all the lines gathered until now
        return oldExchange;
    }
}