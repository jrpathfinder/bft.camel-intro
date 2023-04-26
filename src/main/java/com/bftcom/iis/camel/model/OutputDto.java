package com.bftcom.iis.camel.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class OutputDto {
    LocalDate date;
    LocalDate dateCreated;
    Integer ip;
}
