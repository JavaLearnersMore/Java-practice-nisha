package com.practice.oops.polymorphism;

public class UPI extends Payment{
	void pay(double amount) {
		System.out.println("UPI: Rs." + amount + " paid instantly, no charge");
	}

}
