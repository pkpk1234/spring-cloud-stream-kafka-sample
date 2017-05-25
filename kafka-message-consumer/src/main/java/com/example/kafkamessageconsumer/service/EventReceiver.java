package com.example.kafkamessageconsumer.service;

import com.example.kafka.playload.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Service;

/**
 * Created by pkpk1234 on 2017/5/26.
 */
@Service
@EnableBinding(Sink.class)
public class EventReceiver {
    private Sink sink;

    private EventConsumer eventConsumer;

    @Autowired
    public EventReceiver(Sink sink, EventConsumer eventConsumer) {
        this.sink = sink;
        this.eventConsumer = eventConsumer;
    }

    @StreamListener(Sink.INPUT)
    public void getEvent(Event event) {
        this.eventConsumer.consumer(event);
    }
}
