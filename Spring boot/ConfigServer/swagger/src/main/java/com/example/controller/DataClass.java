package com.example.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Mani;

@RestController
public class DataClass {	
	
	@RequestMapping(method = RequestMethod.GET, value = "api",produces = "application/json")
	public String sayHello() {
		return "Swagger Hello World";
	}
	
	@PostMapping("/post")
	public String post(@RequestBody Mani mani) {
		return "mani";
		
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id) {
		
	}
}
