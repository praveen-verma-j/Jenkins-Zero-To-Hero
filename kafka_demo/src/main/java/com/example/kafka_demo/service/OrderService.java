package com.example.kafka_demo.service;


import org.apache.kafka.clients.admin.NewTopic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import com.example.kafka_demo.data.Order;

@Service
public class OrderService {
	
	static Logger log = LoggerFactory.getLogger(OrderService.class);
	
	@Autowired
	private NewTopic topic;

	@Autowired
	private KafkaTemplate<String,Order> kafkaTemplate;

	public ResponseEntity<String> createOrder(Order order) {
		
		log.info("Reached in Orderservice");

		Message<Order> message = MessageBuilder.withPayload(order)
				.setHeader(KafkaHeaders.TOPIC,topic.name())
				.build();

		kafkaTemplate.send(message);
	
		log.info("Sent message to kafka with {}",order.toString());

	return new ResponseEntity<>(order.getId()+" order created",HttpStatus.CREATED);
	}
}
