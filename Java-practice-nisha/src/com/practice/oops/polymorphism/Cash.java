package com.practice.oops.polymorphism;

public class Cash extends Payment{
	void pay(double amount) {
		System.out.println("Cash: Rs." + amount + " paid at counter");
	}

}
