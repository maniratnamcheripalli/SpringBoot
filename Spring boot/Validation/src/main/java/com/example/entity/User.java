package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;


@Entity
@Table(name = "Validation")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;	
	@NotBlank(message = "not null")
	private String name;
	private String email;
	private String gender;
	@Min(value = 18,message = "Min age is 18")
	@Max(value = 60,message = "Max age is 60")
	private int age;
	public User() {
		super();
	}
	public User(int id, String name, String email, String gender, int age) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.age = age;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", gender=" + gender + ", age=" + age + "]";
	}
}
