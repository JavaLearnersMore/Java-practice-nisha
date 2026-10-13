package com.practice.thread.method;

public class EmployeeMain {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Employee e=new Employee();
		e.start();
		
		System.out.println("main thread is running");
		
		e.join();
		
		System.out.println("nisha more");
	}

}
