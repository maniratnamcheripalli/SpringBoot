package com.example.repository;

import org.hibernate.validator.constraints.ParameterScriptAssert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.entity.Customer;

public interface EcomRepository extends JpaRepository<Customer, Integer>{
	
	@Query("select c.name from Customer c where mail_id=:mail")
	public String add(@Param("mail") String mail);
	
	@Query("select c.name from Customer c where mail_id=:name and password=:password")
	public String checkForUser(@Param("name") String name,@Param("password") String password);
	
	
	

}
