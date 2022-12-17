package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.example.entity.User;
import com.example.repository.UserRepository;

@Component
public class UserService {

	@Autowired
	private UserRepository userRepository;
		
	public User post(User use) {
		User post = userRepository.save(use);
		return post;
	}

	public User get(int id) {
		User findById = userRepository.findById(id);
		return findById;
	}
	
}
