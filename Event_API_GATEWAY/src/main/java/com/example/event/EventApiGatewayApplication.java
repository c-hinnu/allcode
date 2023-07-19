package com.example.event;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EventApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventApiGatewayApplication.class, args);
	}

}
