package com.example.dto;

import java.util.List;

import com.example.Address;
import com.example.Section;

public class StudentDto {
	
	private int id;
	private String name;
	private List<Address> address;
	private Section section;
	public Section getSection() {
		return section;
	}
	public void setSection(Section section) {
		this.section = section;
	}
	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> list) {
		this.address = list;
	}
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
	

}
