package com.practice.oops.polymorphism;

public class OverloadingExample {
	
	int add(int a ,int b) {
		return a+b;
	}
	
	int add(int a ,int b,int c) {
		return a+b+c;
	}
	
	String add(String a ,String b) {
		return a+b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingExample o=new OverloadingExample();
		System.out.println(o.add(10, 20));
		System.out.println(o.add(10, 20, 30));
		System.out.println(o.add("hello", "world"));

	}

}
