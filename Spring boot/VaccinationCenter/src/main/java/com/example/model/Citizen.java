package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Citizen {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String name;
	private String vaccinationCenter;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVaccinationCenter() {
		return vaccinationCenter;
	}

	public void setVaccinationCenter(String vaccinationCenter) {
		this.vaccinationCenter = vaccinationCenter;
	}

	public Citizen(int id, String name, String vaccinationCenter) {
		super();
		this.id = id;
		this.name = name;
		this.vaccinationCenter = vaccinationCenter;
	}

	public Citizen() {
		super();
	}

}
