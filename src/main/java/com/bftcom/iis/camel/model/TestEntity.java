package com.bftcom.iis.camel.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity(name = "test")
public class TestEntity {
    @Id
    Long idTrain;
    LocalDateTime dtStart;
    Long idStationStart;
    String trainName;
}
