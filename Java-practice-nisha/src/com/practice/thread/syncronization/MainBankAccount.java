package com.practice.thread.syncronization;

public class MainBankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount account=new BankAccount();
		
		Thread t=new Thread(new Runnable() {
			@Override
			public void run() {
				account.withdraw(500);
			}
			
		});
		
		t.start();

	}

}
