package com.practice.thread.syncronization;

public class A extends Thread{
	
	 static final Object lock1=new Object();
	static final Object lock2=new Object();
	
	public void run() {
	synchronized (lock1) {
		System.out.println("Thread A lock 1");
	}
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		synchronized (lock2) {
		
	}
	
	}

}
