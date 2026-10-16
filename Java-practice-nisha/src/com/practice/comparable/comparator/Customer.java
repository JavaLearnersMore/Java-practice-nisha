package com.practice.comparable.comparator;

public class Customer {
	
	int id;
	String name;
    Double Price;
    
	public Customer(int id, String name, Double price) {
		
		this.id = id;
		this.name = name;
		Price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return Price;
	}

	public void setPrice(Double price) {
		Price = price;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", Price=" + Price + "]";
	}
}
