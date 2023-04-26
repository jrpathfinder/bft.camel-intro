package com.bftcom.iis.camel.config;

import com.bftcom.iis.camel.generated.IisMsgProtos;
import com.bftcom.iis.camel.model.InputPojo;
import lombok.extern.slf4j.Slf4j;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

@Slf4j
public class KafkaProcessor implements Processor {

    private static final String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
    private static final String IP_NAME = "ip";
    private static final String GUID = "guid";


    @Override
    public void process(Exchange exchange) throws Exception {
        final var guid = UUID.randomUUID().toString();
        exchange.setProperty(GUID, guid);
        exchange.getIn().setBody(IisMsgProtos.RequestMsg.newBuilder()
                .setDtrecieved(((InputPojo) exchange.getIn().getBody()).getDate())
                .setDtsend(LocalDateTime.now().format(DateTimeFormatter.ofPattern(DATE_FORMAT)))
                .setIp((String) exchange.getIn().getHeader(IP_NAME))
                .setGuid(guid)
                .build());
        log.info("Sending message to Kafka {}", exchange.getIn().getBody());
    }
}
