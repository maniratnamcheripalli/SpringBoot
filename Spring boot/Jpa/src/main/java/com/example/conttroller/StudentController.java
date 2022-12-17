package com.example.conttroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Student;
import com.example.repoitory.StudentRepository;

@RestController
public class StudentController {

	@Autowired
	private StudentRepository repository;

	@PostMapping("/savedata")
	public Student save(@RequestBody Student student) {

		Student save = repository.save(student);
		return save;
	}

	@GetMapping("/getAll")
	public List<Student> getAll() {

		List<Student> findAll = repository.findAll();
		return findAll;
	}

	@GetMapping("/get/{branch}")
	public List<Student> findByBranch(@PathVariable String branch) {
		List<Student> byBranch = repository.getByBranch(branch);
		return byBranch;
	}

	@DeleteMapping("/delete/{id}")
	public void Delete(@PathVariable("id") int id) {
		repository.deleteById(id);
	}

	@PutMapping("/update")
	public Student update(@RequestBody Student student) {
		Student save = repository.save(student);
		return save;
	}

}
