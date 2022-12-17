package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.VaccinationCenter;

import com.example.model.AllData;
import com.example.service.VaccinationService;

@RestController
@RequestMapping("/vacciantion")
public class VaaccinationController {
	
	@Autowired
	private VaccinationService service;
	
	@PostMapping("/add")
	public VaccinationCenter save(@RequestBody VaccinationCenter center) {
		return service.save(center);
		
	}
	
	@GetMapping("/id/{id}")
	public AllData  save(@PathVariable Integer id) {
		
		
		return service.find(id);
		
	}
}
