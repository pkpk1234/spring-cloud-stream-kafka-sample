package com.example.kafkamessageproducer;

import com.example.kafka.playload.Event;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

@RunWith(SpringRunner.class)
@JsonTest
public class KafkaMessageProducerApplicationTests {

	@Autowired
	private JacksonTester<Event> json;

	@Test
	public void testJson() throws IOException {
		String jsonString = this.json.write(new Event("lijiaming test event.")).getJson();
		System.out.println("jsonString is " + jsonString);
	}

}
