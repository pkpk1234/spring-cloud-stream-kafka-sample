package com.example.kafkamessageproducer.controller;

import com.example.kafka.playload.Event;
import com.example.kafkamessageproducer.service.EventSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by pkpk1234 on 2017/5/25.
 */

@RestController
public class EventContoller {

    private EventSender eventSender;

    @Autowired
    public EventContoller(EventSender eventSender) {
        this.eventSender = eventSender;
    }

    @PostMapping("/send")
    public ResponseEntity<String> sendEvent(@RequestBody Event event) {
        this.eventSender.sendEvent(event);
        return ResponseEntity.ok("Send Event to Kafka");
    }
}
