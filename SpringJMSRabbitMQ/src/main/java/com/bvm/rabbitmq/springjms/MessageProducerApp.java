package com.bvm.rabbitmq;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MessageProducerApp {

	final static String queueName = "message_queue";

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(RabbitMQProducerConfig.class);
		RabbitTemplate template = (RabbitTemplate) context.getBean("rabbitTemplate");

		// methods converts java object to AMQP message is sent to default topic exchange
		template.convertAndSend(queueName, "Hello World!");
		System.out.println("Message has been set successfully to Queue");

		context.close();
	}

}
