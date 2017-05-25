package com.example.kafkamessageconsumer.service;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * Created by pkpk1234 on 2017/5/26.
 */
public interface Sink {
    String INPUT = "event";

    @Input(Sink.INPUT)
    SubscribableChannel input();
}
