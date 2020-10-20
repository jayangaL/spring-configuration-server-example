package com.example.demoserverconfigspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class DemoServerConfigSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoServerConfigSpringApplication.class, args);
	}

}
