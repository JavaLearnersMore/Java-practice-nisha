package com.practice.thread.method;

public class Employee extends Thread{
	
	public void run() {
		System.out.println("start working ");
	
	for(int i=0;i<=5;i++) {
	System.out.println("employee working on task :" +i);	
	

//	try {
//		Thread.sleep(3000);
//
//	}catch(InterruptedException  e) {
//		System.out.println("employee was intterupted");
//	}
//	}
	 Thread.yield();
	 System.out.println("after yeild method");
	}
	 System.out.println("emloyee complete work");
 }

}
