package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.entity.Citizen;
import com.example.repository.CitizenRepository;

@Repository
public class CitizenService {
	
	@Autowired
	private CitizenRepository citizenRepository;
	
	public Citizen save(Citizen citizen) {
		return citizenRepository.save(citizen);
	}
	
	public List<Citizen> getAll() {
		return (List<Citizen>) citizenRepository.findAll();
	}
}
