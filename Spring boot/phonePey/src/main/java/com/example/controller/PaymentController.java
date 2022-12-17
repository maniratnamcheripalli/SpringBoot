package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.Payment;
import com.example.dto.TransactionDto;
import com.example.service.PaymentService;

@RestController
@RequestMapping("/phonePey")
public class PaymentController {
	
	@Autowired
	private PaymentService service;
	
	@PostMapping("/payment")
	public TransactionDto save(@RequestBody Payment payment) {
		
		return service.insert(payment);
		
	}
}
