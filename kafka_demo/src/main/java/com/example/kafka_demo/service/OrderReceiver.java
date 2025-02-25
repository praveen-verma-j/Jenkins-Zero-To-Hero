package com.example.kafka_demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.example.kafka_demo.data.Order;

@Service
public class OrderReceiver {
	
	
	private static Logger log=LoggerFactory.getLogger(OrderReceiver.class);
	
	@KafkaListener(topics="${spring.kafka.topic.name}", groupId="${spring.kafka.consumer.groupId}")
	public void receiveMessage(Order ord) {
		
		log.info("Consumer received this order {}",ord.toString());
	}

}
