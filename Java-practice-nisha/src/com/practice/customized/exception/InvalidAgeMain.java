package com.practice.customized.exception;

public class InvalidAgeMain {
	
	public void checkAge(int age) throws InvalidAgeException {
		if(age<=18) {
			throw new InvalidAgeException("invalid age");
		}
		else {
			System.out.println("valid age");
		}
	}

	public static void main(String[] args)   {
		// TODO Auto-generated method stub
		InvalidAgeMain i=new InvalidAgeMain();
		
		try {
			i.checkAge(34);
		} catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	

}
