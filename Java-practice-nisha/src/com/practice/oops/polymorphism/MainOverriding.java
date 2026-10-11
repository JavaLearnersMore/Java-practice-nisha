package com.practice.oops.polymorphism;

public class MainOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payment[] payments = { new UPI(), new Cash() };
		
		for (Payment p : payments) {
			 p.pay(1000); 
		}
	}

}
