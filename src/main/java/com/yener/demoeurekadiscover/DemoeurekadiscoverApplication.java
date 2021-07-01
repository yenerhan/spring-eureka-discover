package com.yener.demoeurekadiscover;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DemoeurekadiscoverApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoeurekadiscoverApplication.class, args);
	}

}
