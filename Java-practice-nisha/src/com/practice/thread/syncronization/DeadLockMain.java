package com.practice.thread.syncronization;

public class DeadLockMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a=new A();
		B b=new B();
		
		a.start();
		b.start();

	}

}
