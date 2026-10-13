package com.practice.thread;

public class Mythread extends Thread{
	
	public void run() {
		
		for(int i=1;i<10;i++) {
			System.out.println("THread 1 :"+i);
		}
	}

}
