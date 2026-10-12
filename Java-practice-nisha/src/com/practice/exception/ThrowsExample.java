package com.practice.exception;

public class ThrowsExample {
	
	public static void display()throws InterruptedException {
		System.out.println("display method");
		
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub}
		try {
		display();
		}catch(InterruptedException e) {
			System.out.println("Thread interrupted");
		}
	}

}
