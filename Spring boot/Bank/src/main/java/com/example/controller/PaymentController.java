package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.TransactionDto;
import com.example.model.Payment;
import com.example.service.PaymentService;

@RestController
public class PaymentController {
	
	@Autowired
	private PaymentService service;
	
	@PostMapping("/payment")
	public TransactionDto save(@RequestBody Payment payment) {
		
		return service.insert(payment);
		
	}
}
