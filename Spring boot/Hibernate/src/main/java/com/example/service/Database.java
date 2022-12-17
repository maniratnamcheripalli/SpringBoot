package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Address;
import com.example.Student;
import com.example.dto.StudentDto;
import com.example.repository.StudentRepository;

@Service
public class Database {


	@Autowired
	private StudentRepository student;

	public Student save(Student b) {
		for (Address a : b.getAddress()) {
			a.setStudent(b);
		}
		Student save = student.save(b);
		return save;
	}

	public List<StudentDto> getAll() {
//		Iterable<Student> findAll = student.findAll();
		List<Student> findAll = student.getAllUser();
		List<StudentDto> sl = new ArrayList<>();
		for(Student s: findAll) {
			StudentDto sd = new StudentDto();
			sd.setId(s.getId());
			sd.setName(s.getName());
			sd.setSection(s.getSection());
			sd.setAddress(s.getAddress());
			
			sl.add(sd);
		}
		return (List<StudentDto>) sl;

	}
	public List<StudentDto> get(){
		List<Student> list = student.get();
		List<StudentDto> sl = new ArrayList<>();
		List<StudentDto> cse = new ArrayList<>();
		List<StudentDto> ece = new ArrayList<>();
		List<StudentDto> civil = new ArrayList<>();
		List<StudentDto> eie = new ArrayList<>();
		List<StudentDto> count = new ArrayList<>();


		for(Student s:list) {
			StudentDto sd = new StudentDto();
			sd.setId(s.getId());
			sd.setName(s.getName());
			sd.setSection(s.getSection());
			sd.setAddress(s.getAddress());
			sl.add(sd);
			
			String section=s.getSection().getName();
			if(section.equals("CSE")) {
				sd.setId(s.getId());
				sd.setName(s.getName());
				sd.setSection(s.getSection());
				sd.setAddress(s.getAddress());
				cse.add(sd);
				
			}else if(section.equals("EIE")) {
				sd.setId(s.getId());
				sd.setName(s.getName());
				sd.setSection(s.getSection());
				sd.setAddress(s.getAddress());
				eie.add(sd);
								
			}else if(section.equals("Civil")) {
				sd.setId(s.getId());
				sd.setName(s.getName());
				sd.setSection(s.getSection());
				sd.setAddress(s.getAddress());

				civil.add(sd);
				
			}else {
				
				sd.setId(s.getId());
				sd.setName(s.getName());
				sd.setSection(s.getSection());
				sd.setAddress(s.getAddress());

				ece.add(sd);
			}
		}
		List array[]= {cse,ece,eie,civil};
		for(int i=0;i<array.length;i++) {
			if(array[i].size()>1) {
				count.addAll(array[i]);
				System.out.println(array[i].size());
			}
		
		}
		return count;
	}
	
	
	
	//FOR PATTERN CHECKING
	
	public List<Student> fetch(String name) {
		List<Student> find = student.find(name);
		
		return find;	
	}


}
