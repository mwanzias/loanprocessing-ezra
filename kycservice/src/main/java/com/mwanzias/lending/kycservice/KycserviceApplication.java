package com.mwanzias.lending.kycservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class KycserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(KycserviceApplication.class, args);
	}

}
