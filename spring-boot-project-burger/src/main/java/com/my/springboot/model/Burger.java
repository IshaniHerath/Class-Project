package com.my.springboot.model;

public class Burger {
	
	private int id;
	private String name;
	private int price;
	private int qty;
	private int total;
	
	public Burger() {
	}

	public Burger(int id, String name, int price, int qty, int total) {
		this.id = id;
//		this.cname = cname;
		this.name = name;
		this.price = price;
		this.qty = qty;
		this.total = total;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

//	public String getCname() {
//		return cname;
//	}
//
//	public void setCname(String cname) {
//		this.cname = cname;
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
	
	
}