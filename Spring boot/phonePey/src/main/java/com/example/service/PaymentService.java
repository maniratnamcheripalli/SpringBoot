package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.example.dto.Payment;
import com.example.dto.TransactionDto;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class PaymentService {

	@Autowired
	private RestTemplate restTemplate;

	public TransactionDto insert(Payment payment) {

		String postForObject = null;
		TransactionDto response = null;
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		ObjectMapper objectMapper = new ObjectMapper();
		String jsonRequest;
		try {
			jsonRequest = objectMapper.writeValueAsString(payment);
			HttpEntity<String> entity = new HttpEntity<String>(jsonRequest, headers);
			postForObject = restTemplate.postForObject("http://localhost:8080/payment", entity, String.class);
			response = objectMapper.readValue(postForObject, TransactionDto.class);
		} catch (JsonProcessingException e) {
			System.out.println("ERROR " + e.getMessage());
		}

		return response;
	}
}
