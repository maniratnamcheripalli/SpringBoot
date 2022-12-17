package com.example.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.User;
import com.example.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/user")
	public User post(@RequestBody @Valid User user ) {
		User post = userService.post(user);
		return post;
	}
	
	@GetMapping("/user/{id}")
	public User use(@PathVariable("id") int id) {
		User user = userService.get(id);
		return user;
		
	}
}
