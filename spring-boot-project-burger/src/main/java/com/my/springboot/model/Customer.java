package com.my.springboot.model;

public class Customer {
	
	private String cname;

	
	public Customer() {
	}

	public Customer(String cname) {
		this.cname = cname;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

}
