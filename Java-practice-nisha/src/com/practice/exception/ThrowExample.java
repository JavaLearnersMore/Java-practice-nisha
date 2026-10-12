package com.practice.exception;

public class ThrowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age=21;
		if(age<=18) {
			throw new ArithmeticException( "not eligible for voting ");
		}else {
			System.out.println("eligible for voting");
		}
	}

}
