package com.practice.thread;

public class RunnableMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyRunnable m=new MyRunnable();
		
		Thread t=new Thread(m);
		t.start();
		
		for(int i=1;i<=10;i++) {
			System.out.println("Thread 2 :"+i);
		}
	}

}
