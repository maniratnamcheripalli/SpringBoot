package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.dao.Ordertable;
import com.example.entity.Cart;

public interface OrderRepository extends JpaRepository<Ordertable, Integer>{
	
	

	@Query("select c from Ordertable c where c.username=:name")
	List<Ordertable> findByName(@Param("name") String name);
	
	
	
	
	
}
