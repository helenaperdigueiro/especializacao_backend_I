package com.dh.movie;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableRabbit
@SpringBootApplication
public class MovieApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieApplication.class, args);
	}

}
