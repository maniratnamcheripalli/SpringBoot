package com.example.dto;

public class Payment {

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
