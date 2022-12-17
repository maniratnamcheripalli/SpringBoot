package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RefreshScope
public class InsuranceClientApplication {

	
	
	public static void main(String[] args) {
		SpringApplication.run(InsuranceClientApplication.class, args);
		
		
	}
	
	@Bean
	public RestTemplate getRestTemplate() {
		RestTemplate restTemplate=new RestTemplate();
		return restTemplate;
	}

}
