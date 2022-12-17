package com.example.repository;

import java.util.List;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.Dto;
import com.example.GroupAll;
import com.example.Section;
import com.example.Student;
public interface StudentRepository extends CrudRepository<Student, Integer>{
//	
//	public Student findById(int id);
	
	@Query("select u from Student u Join fetch u.section Join fetch u.address")
	public List<Student> getAllUser();
	
	
	@Query("select new com.example.Dto(COUNT(u.id),se.name) from Student u Join Section se ON u.id=se.id group by se.name")
	public List<Dto> countUser();

	@Query("select new com.example.Dto(COUNT(u.id),se.name) from Student u Join Section se ON u.id=se.id group by se.name having COUNT(u.id)>1")
	public List<Dto> groupAll();

}

