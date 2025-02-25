package com.example.kafka_demo.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class Configs {
	
	@Bean
	public NewTopic createTopic() {
		return TopicBuilder.name("order_topic").build();
	}

}
