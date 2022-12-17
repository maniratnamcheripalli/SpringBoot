package com.example.model;

import java.util.List;

import com.example.Entity.VaccinationCenter;

public class AllData {
	
	private VaccinationCenter center;
	
	private List<Citizen> citizen;

	public VaccinationCenter getCenter() {
		return center;
	}

	public void setCenter(VaccinationCenter center) {
		this.center = center;
	}

	public List<Citizen> getCitizen() {
		return citizen;
	}

	public void setCitizen(List<Citizen> citizen) {
		this.citizen = citizen;
	}
	

}
