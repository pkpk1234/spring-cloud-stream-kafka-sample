package com.example.kafkamessageproducer.service;

import com.example.kafka.playload.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

/**
 * Created by pkpk1234 on 2017/5/25.
 */

@Service
@EnableBinding(Source.class)
public class EventSender {

    private Source source;

    @Autowired
    public EventSender(Source source) {
        this.source = source;
    }

    public void sendEvent(Event event) {
        this.source.output().send(MessageBuilder.withPayload(event).build());
    }
}
