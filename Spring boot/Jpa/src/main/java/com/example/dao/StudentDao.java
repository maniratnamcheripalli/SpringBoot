package com.example.dao;

import java.util.List;

public class StudentDao {
	
	private int id;
	private String name;
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
	public StudentDao() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentDao(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	
	
}
