package com.example.kafka_demo.data;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
public class Order {
		
	private int id;
	private String product;
	private int qty;
	public Order() {
		super();
	}
	public Order(int id, String product, int qty) {
		super();
		this.id = id;
		this.product = product;
		this.qty = qty;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", product=" + product + ", qty=" + qty + "]";
	}

	
	
}
