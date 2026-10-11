package com.practice.oops.encapsulation;

public class EncapsulationExample {
	
	private double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public static void main(String[] args) {
		EncapsulationExample e=new EncapsulationExample();
		e.setBalance(1000);
		System.out.println("baance is :" +e.getBalance());
		

	}
}
