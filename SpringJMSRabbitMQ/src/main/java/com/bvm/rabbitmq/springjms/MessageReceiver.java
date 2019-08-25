package com.bvm.rabbitmq;

import java.util.concurrent.CountDownLatch;

public class MessageReceiver {

	private CountDownLatch latch = new CountDownLatch(1);

	public void receiveMessage(String message) {
		System.out.println("Message received : " + message);
		latch.countDown();
	}

	public CountDownLatch getCountDownLatch() {
		return latch;
	}
}
