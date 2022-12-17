package com.example.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.entites.User;

public interface UserRepository extends CrudRepository<User, Integer>{
	

	public List<User> findByName(String name);
	
	@Query("select u from User u")
	public List<User> getAllUser();
	
	@Query("select u from User u where u.name=:n")
	public User getById(@Param("n") String name);

}
