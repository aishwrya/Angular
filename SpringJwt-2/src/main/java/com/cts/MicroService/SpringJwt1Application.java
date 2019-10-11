package com.cts.MicroService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringJwt1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringJwt1Application.class, args);
	}

}
