package com.example.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.PaymentDao;
import com.example.dto.TransactionDto;
import com.example.model.Payment;

@Service
public class PaymentService {
	
	@Autowired
	private PaymentDao paymentDao;
	
	 @Transactional
	public TransactionDto insert(Payment payment) {
		 this.paymentDao.save(payment);
		 
		 TransactionDto dto=new TransactionDto();
		 dto.setId(payment.getTransactionId());
		 dto.setStatus("Success");
		 dto.setVendor(payment.getVendor());
		 return dto;
		
	}
}
