package com.mwanzias.lending.loanproduct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class LoanproductApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoanproductApplication.class, args);
	}

}
