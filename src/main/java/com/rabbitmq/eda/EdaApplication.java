package com.rabbitmq.eda;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRabbit
public class EdaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EdaApplication.class, args);
	}

}
