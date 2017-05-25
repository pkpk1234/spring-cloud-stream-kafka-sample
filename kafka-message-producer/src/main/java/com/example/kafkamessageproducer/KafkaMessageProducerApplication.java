package com.example.kafkamessageproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * curl -d '{"message":"test1"}' -H "Content-Type:application/json" http://localhost:8080
 */
@SpringBootApplication
public class KafkaMessageProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaMessageProducerApplication.class, args);
	}
}
