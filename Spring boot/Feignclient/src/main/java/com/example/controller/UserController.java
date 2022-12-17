package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Citizen;

@RestController
public class UserController {
	
	@Autowired
	private Repository repository;
	
	
	@GetMapping("/name")
	public String name() {
		return "Mani";
		
	}
	
	
	@GetMapping("/state")
	public String state() {
		return "Telangana";
	}
	
	@GetMapping("/get")
	public List<Citizen> getAll(){
		return (List<Citizen>) repository.findAll();
	}
	
	

}
