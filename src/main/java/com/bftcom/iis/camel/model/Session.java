package com.bftcom.iis.camel.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

@Entity
@Table(name = "sessionz")
@Data
@Accessors(chain = true)
public class Session {
    @Id
    String guid;
    String ip;
    LocalDateTime dtSend;
    LocalDateTime dtRecieved;
}
