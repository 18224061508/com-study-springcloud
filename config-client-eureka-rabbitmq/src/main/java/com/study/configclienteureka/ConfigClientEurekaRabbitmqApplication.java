package com.study.configclienteureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConfigClientEurekaRabbitmqApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientEurekaRabbitmqApplication.class, args);
	}
}
