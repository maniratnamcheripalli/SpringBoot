package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.Entity.VaccinationCenter;

public interface VaccinationnRepository extends CrudRepository<VaccinationCenter, Integer> {
	
	

}
