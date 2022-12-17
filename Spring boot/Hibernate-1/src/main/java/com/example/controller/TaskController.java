package com.example.controller;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Address;
import com.example.Dto;
import com.example.GroupAll;
import com.example.Student;
import com.example.dto.StudentDto;
import com.example.repository.StudentRepository;


@RestController
public class TaskController {

	@Autowired
	private StudentRepository db;


	@PostMapping("/student")
	public Student save(@RequestBody Student student) {
		for (Address a : student.getAddress()) {
			a.setStudent(student);
		}
		Student save = db.save(student);
		return save;
	}
	
	@GetMapping("/students")
	public List<Student> getAll() {
		List<Student> all = db.getAllUser();
		List<StudentDto> sl = new ArrayList<>();
		for(Student s: all) {
			StudentDto sd = new StudentDto();
			sd.setId(s.getId());
			sd.setName(s.getName());
			sd.setSection(s.getSection());
			sd.setAddress(s.getAddress());		
			sl.add(sd);
		}
		return all;
	}
	
	@GetMapping("/students/get")
	public List<Dto> countUser() {
		List<Dto> all = db.countUser();
		return all;
	}
	
	@GetMapping("/students/group")
	public List<Dto> groupAll() {
		List<Dto> all = db.groupAll();
		return all;
	
	}
}
