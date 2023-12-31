package com.project.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GatewayElearnApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayElearnApplication.class, args);
	}

}
