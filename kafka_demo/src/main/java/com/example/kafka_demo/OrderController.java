package com.example.kafka_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.kafka_demo.data.Order;
import com.example.kafka_demo.service.OrderService;

@RestController
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@PostMapping("/newOrder")
	public ResponseEntity<String> createOrder(@RequestBody Order order) {
		
		return orderService.createOrder(order);
	}
	
	

}
