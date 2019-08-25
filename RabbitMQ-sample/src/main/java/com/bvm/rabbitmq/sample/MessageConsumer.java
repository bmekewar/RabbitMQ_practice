package com.bvm.rabbitmq.sample;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.DeliverCallback;

public class MessageConsumer {

	public final static String QUEUE_NAME = "Message_Queue";

	public static void main(String[] args) throws Exception {
		ConnectionFactory factory = new ConnectionFactory();
		factory.setHost("localhost");

		Connection connection = factory.newConnection();
		Channel channel = connection.createChannel();

		channel.queueDeclare(QUEUE_NAME, false, false, false, null);

		try {
			DeliverCallback callback = (consumberTag, delivery) -> {
				String message = new String(delivery.getBody(), "UTF-8");
				System.out.println("[x] Received '" + message + "'");
			};

			channel.basicConsume(QUEUE_NAME, true, callback, consumerTag -> {
			});
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
