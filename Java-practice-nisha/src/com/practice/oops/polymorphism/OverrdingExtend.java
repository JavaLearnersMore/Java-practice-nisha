package com.practice.oops.polymorphism;

public class OverrdingExtend extends Overriding{

	@Override
	public void add(int a,int b) {
		super.add(a, b);
		System.out.println("child addition is :"+(a+b));
	}
	
	@Override
	void display() {
		super.display();
		System.out.println("this is child class addition");
	}

  
}
