package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.example.Entity.VaccinationCenter;
import com.example.model.AllData;
import com.example.repository.VaccinationnRepository;

@Repository
public class VaccinationService {
	
	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private VaccinationnRepository vaccinationnRepository;

	public VaccinationCenter save(VaccinationCenter center) {
		return vaccinationnRepository.save(center);
	}

	public AllData find(Integer id) {
		AllData all=new AllData();
		
		VaccinationCenter vaccinationCenter = vaccinationnRepository.findById(id).get();
		
		all.setCenter(vaccinationCenter);
		
		List forObject = restTemplate.getForObject("http://CITIZEN-SERVICE/citizen/get",List.class);
		all.setCitizen(forObject);	
		return all;
	}

}
