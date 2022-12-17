package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.entity.Citizen;

public interface CitizenRepository extends CrudRepository<Citizen, Integer> {
	
	

}
