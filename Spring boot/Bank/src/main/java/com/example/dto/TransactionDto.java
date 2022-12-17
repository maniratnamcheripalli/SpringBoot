package com.example.dto;


public class TransactionDto {
	
	
	private long id;
	private String status;
	private String vendor;
	public long getId() {
		return id;
	}
	public void setId(long l) {
		this.id = l;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getVendor() {
		return vendor;
	}
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
	public TransactionDto(long id, String status, String vendor) {
		super();
		this.id = id;
		this.status = status;
		this.vendor = vendor;
	}
	public TransactionDto() {
		super();
	}
	
	
	
}
