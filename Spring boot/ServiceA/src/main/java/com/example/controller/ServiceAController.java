package com.example.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import io.github.resilience4j.retry.annotation.Retry;

@RestController
@RequestMapping("/a")
public class ServiceAController {

	int c = 1;
	@Autowired
	private RestTemplate restTemplate;

	private static final String serviceA = "service";

	@GetMapping
//	@CircuitBreaker(name = serviceA,fallbackMethod = "fallBack")
//	@Retry(name = serviceA, fallbackMethod = "fallBack")
	@RateLimiter(name = serviceA,fallbackMethod = "fallBack")
	public String serviceA() {

		return restTemplate.getForObject("http://localhost:8081/b/get", String.class);
	}

	public String fallBack(Exception e) {
		return "From fallback method";
	}
}
