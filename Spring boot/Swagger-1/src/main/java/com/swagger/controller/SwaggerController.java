package com.swagger.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SwaggerController {

	
	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public String get() {
		return "Get Method";
	}
	
	
	
}
