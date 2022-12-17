package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Citizen;
import com.example.util.FeignService;

@RestController
@RequestMapping("/feign")
public class ImplementationClass {
	@Autowired
	private FeignService feign;
	
	@GetMapping("/user-name")
	public String getname() {
		return feign.name();
	}

	@GetMapping("/user-state")
	String getstate() {
		return feign.state();
	}
	
	@GetMapping("/client")
	List<Citizen> getAll() {
		return feign.getAll();
	}

}
