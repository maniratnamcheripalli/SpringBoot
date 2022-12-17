package com.example.repository;

import java.util.List;



import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.Student;
import com.example.dto.Dto;
public interface StudentRepository extends CrudRepository<Student, Integer>{
//	
//	public Student findById(int id);
	
	@Query("select u from Student u JOIN fetch u.address JOIN fetch u.section")
	public List<Student> getAllUser();
	
	@Query("select u from Student u JOIN fetch u.section JOIN fetch u.address")
	public List<Student> get();

	@Query(value="select stu.section_id,s.name from Student AS stu JOIN Section AS S  ON stu.section_id=s.id GROUP BY s.name",nativeQuery = true)
 	public List<Student> read();
	
	@Query("select u from Student u where u.name like %:n% ")
	public List<Student> find(@Param("n")  String name);
	
	
	@Query("select new com.example.Dto(COUNT(u.id),se.name) from Student u Join Section se ON u.id=se.id group by se.name")
	public List<Dto> countUser();


	@Query("select new com.example.Dto(COUNT(u.id),se.name) from Student u Join Section se ON u.id=se.id group by se.name having COUNT(u.id)>1")
	public List<Dto> groupAll();
	
}

