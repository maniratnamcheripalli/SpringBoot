package com.example.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.entity.Cart;

public interface CartRepository extends JpaRepository<Cart, Integer>{

	@Query("select c from Cart c where c.username=:name")
	List<Cart> findByName(@Param("name") String name);
	


}
