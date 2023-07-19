package com.project.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class UserElearnApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserElearnApplication.class, args);
	}

}
