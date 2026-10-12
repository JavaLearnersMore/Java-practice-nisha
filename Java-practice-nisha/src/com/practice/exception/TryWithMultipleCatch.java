package com.practice.exception;

public class TryWithMultipleCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int num=10/2;
			System.out.println(num);
			String s=null;
			System.out.println(s.length());
			
		}catch(NullPointerException e) {
			e.printStackTrace();
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
