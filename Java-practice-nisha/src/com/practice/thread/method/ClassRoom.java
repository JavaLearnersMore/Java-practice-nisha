package com.practice.thread.method;

public class ClassRoom {
	
	synchronized void studentWait() {

		try {
			
			System.out.println("Student Waiting ");
			 wait();
				System.out.println("student start studying");
		}catch(InterruptedException e) {
			System.out.println();
		}
		
	}
		synchronized void teacherNotify() {
			notify();
			System.out.println("teacher is notifying one student");
			
		
		
	}
	

}
