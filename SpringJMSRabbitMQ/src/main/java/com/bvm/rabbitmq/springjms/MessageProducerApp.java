package com.bvm.rabbitmq.springjms;

import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bvm.rabbitmq.springjms.model.Product;

public class MessageProducerApp {

	final static String queueName = "message_queue";

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				RabbitMQProducerConfig.class);
		RabbitTemplate template = (RabbitTemplate) context.getBean("rabbitTemplate");

		// methods converts java object to AMQP message is sent to default topic
		// exchange
		//template.convertAndSend(queueName, "Hello World!");

		// methods converts java object to AMQP message is sent to default topic
		// exchange
		Product chocolate = new Product("Chocolate", "Chocolate1", 100);
		template.convertAndSend(queueName, chocolate);

		System.out.println("Message has been set successfully to Queue");

		context.close();
	}

}
