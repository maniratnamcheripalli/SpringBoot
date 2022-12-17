package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Payment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private long transactionId;
	private String vendor;
	private long amount;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(long transactionId) {
		this.transactionId = transactionId;
	}



	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Payment(int id, long transactionId, String name, long amount) {
		super();
		this.id = id;
		this.transactionId = transactionId;
		this.vendor = name;
		this.amount = amount;
	}

}
