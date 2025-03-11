package com.mwanzias.lending.microserviceconfig_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MicroserviceconfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceconfigServerApplication.class, args);
	}

}
