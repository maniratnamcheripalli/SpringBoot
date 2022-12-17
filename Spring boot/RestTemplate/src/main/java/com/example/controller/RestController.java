package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.model.Modile;
import com.example.service.serviceLayer;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@Autowired
	private serviceLayer serviceLayer;
	
	@GetMapping("/")
	public Modile get() {
		return serviceLayer.getAll();
		
	}
	
	

}
