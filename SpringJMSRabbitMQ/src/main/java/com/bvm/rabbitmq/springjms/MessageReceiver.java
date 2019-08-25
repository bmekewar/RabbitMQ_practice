package com.bvm.rabbitmq.springjms;

import java.util.concurrent.CountDownLatch;

import com.bvm.rabbitmq.springjms.model.Product;

public class MessageReceiver {

	private CountDownLatch latch = new CountDownLatch(1);

	/*
	 * public void receiveMessage(String message) {
	 * System.out.println("Message received : " + message); latch.countDown(); }
	 */
	public void receiveProduct(Product product) {
		System.out.println("Product Name: " + product.getProductName());
		System.out.println("Product ID: " + product.getProductId());
		System.out.println("Product Quantity: " + product.getQuantity());
		latch.countDown();
	}

	public CountDownLatch getCountDownLatch() {
		return latch;
	}
}
