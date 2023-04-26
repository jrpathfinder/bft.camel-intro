package com.bftcom.iis.camel;

import com.bftcom.iis.camel.model.Session;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SessionRepository extends CrudRepository<Session, String> {

    List<Session> findByIp(String ip);

    Session findByGuid(String guid);
}