package com.practice.exception.unchecked;

public class RumtimeExceptionExample {

	public static void main(String[] args) {
		
		int a=10;
		int b=0;
		try {
		 int result=a/b;
		 System.out.println(result);
		}catch(ArithmeticException e) {
	    System.out.println("cannot fivided by zero");
	    e.printStackTrace();
		}
		
		
		
		int[] arr= new int[3];
		try {
		arr[0]=2;
		arr[1]=3;
		arr[2]=4;
		arr[3]=5;
		System.out.println(arr[4]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Cannot dividedby zero");
			e.getStackTrace();
		}
		
		try {
		String name=null;
	System.out.println(name.length());
		}catch(NullPointerException e) {
			System.out.println("name is null");
			e.printStackTrace();
		}
		
		
		try {
			int num=Integer.parseInt("nisha");
		}catch(NumberFormatException e) {
			e.printStackTrace();
			System.out.println("String cannot convert");
		}
		
	try {
		String s="nisha";
		System.out.println(s.charAt(10));
	}catch(StringIndexOutOfBoundsException e) {
		e.printStackTrace();
		
	}
	
	  try {
          Thread.sleep(-100);
          System.out.println("main thread");
      } catch (IllegalArgumentException e) {
          System.out.println("7. IllegalArgumentException: " + e);
      } catch (InterruptedException e) {
          System.out.println("Thread interrupted");
      }

	
		
		
		
		
		 
}

}
