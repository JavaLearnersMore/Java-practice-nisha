package com.practice.oops.inheritance;

public class Car extends Vehicle {

	 int price;
	 
	Car(String name,int price) {
		super(name);

		this.price=price;
		 System.out.println("Child constructor");
	  }
	
		  void display() {
			    System.out.println("Car name: " + name);
		        System.out.println("Price: " + price);
		    
	}

}
