package com.practice.thread.method;

import com.practice.thread.Mythread;

public class ThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mythread m=new Mythread();
		m.start();
		
		for(int i=1;i<=10;i++) {
			System.out.println("Thread 2 :"+i);
		}
		
	}

}
