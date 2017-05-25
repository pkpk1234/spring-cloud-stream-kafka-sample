package com.example.kafkamessageproducer.service;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * Created by pkpk1234 on 2017/5/25.
 */
public interface Source {

    String OUTPUT = "event";

    @Output(Source.OUTPUT)
    MessageChannel output();
}
