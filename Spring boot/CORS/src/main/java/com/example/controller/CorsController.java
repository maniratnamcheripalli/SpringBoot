package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class CorsController {
	
	@RequestMapping("/cors")
	public String home() {
		
		return "home";
	}
	
	@GetMapping("/access")
	@ResponseBody
	@CrossOrigin("http://localhost:8083")
	public String display() {
		
		return "Hello Resource";
	
	}
	
	
}
