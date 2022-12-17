package com.example.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.model.Payment;

public interface PaymentDao extends CrudRepository<Payment, Integer>{

	
}
