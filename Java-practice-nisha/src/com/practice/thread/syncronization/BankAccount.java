package com.practice.thread.syncronization;

public class BankAccount {
	
	double balance=2000;
	
	synchronized void withdraw(int amount) {
		
		System.out.println("Trying to withdraw..");
		
		if(balance >= amount) {
			System.out.println("Thread 1 is withdrawing amount :"+amount);
		
		balance -= amount;
		System.out.println("remaining balance is :"+balance);
		}
		
		else {
			System.out.println("Infficient Balance");
		}
	}

}
