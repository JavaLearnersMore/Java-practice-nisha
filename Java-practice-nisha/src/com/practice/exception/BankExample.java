package com.practice.exception;

public class BankExample {
	public static void main(String[] args) {
		
		int balance=100;
		int withdraw=200;
		
        try {
            if (withdraw > balance) {
                throw new ArithmeticException("Insufficient balance");
            }
            
            balance=balance-withdraw;
            System.out.println(balance);
            
            }catch(ArithmeticException e) {
            	System.out.println(e.getMessage());
            }
             
       }
}