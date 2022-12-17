package com.example.controller;

import java.util.List;


import javax.lang.model.type.PrimitiveType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Citizen;
import com.example.service.CitizenService;
import com.netflix.discovery.converters.Auto;

@RestController
@RequestMapping("/citizen")
public class CitizenController {
	
	@Autowired
	private CitizenService citizenService;
	
	@PostMapping("/add")
	public Citizen add(@RequestBody Citizen citizen) {	
		return citizenService.save(citizen);
	}
	
	@GetMapping("/get")
	public List<Citizen> getAll(){
		return (List<Citizen>) citizenService.getAll();
	}

}
