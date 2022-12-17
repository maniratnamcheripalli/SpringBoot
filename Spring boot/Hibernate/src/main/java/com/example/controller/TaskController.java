package com.example.controller;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Section;
import com.example.Student;
import com.example.dto.CountDto;
import com.example.dto.Dto;
import com.example.dto.StudentDto;
import com.example.repository.StudentRepository;
import com.example.service.Database;

@RestController
public class TaskController {

	@Autowired
	private Database db;
	@Autowired
	StudentRepository s;

	@PostMapping("/student")
	public Student save(@RequestBody Student student) {
		Student save = db.save(student);
		return save;
	}

	@GetMapping("/students")
	public List<StudentDto> getAll() {
		List<StudentDto> all = db.getAll();
		return all;
	}

	@GetMapping("/studentss")
	public List<StudentDto> get() {
		List<StudentDto> all = db.get();
		return all;
	}
	@GetMapping("/students/{name}")
	public List<Student> fetch(@PathVariable("name") String name){
		List<Student> fetch = db.fetch(name);
		return fetch;
	}
	

//	@GetMapping("/students/get")
//	public List<Dto> countUser() {
//		List<Dto> all = s.countUser();
//		return all;
//	}

}
