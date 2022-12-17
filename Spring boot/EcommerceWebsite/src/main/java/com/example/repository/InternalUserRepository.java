package com.example.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.entity.Products;


public interface InternalUserRepository extends JpaRepository<Products, Integer>{
	
	@Query("select u from Products u where id=:id")
	public List<Products> getProductDetailsById(@Param("id") int id);
	
	@Query("select u from Products u where u.product=:property")
	public List<Products> getByProperty(@Param("property") String property);

	@Query("select u from Products u where u.id in(12,13,14,18,20,21,25,26,27,31,34,36)")
	public List<Products> findFromDifferentCategory();
}
