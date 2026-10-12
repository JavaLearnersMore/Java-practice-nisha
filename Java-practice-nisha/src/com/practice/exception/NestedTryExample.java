package com.practice.exception;

public class NestedTryExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
	            System.out.println("Outer try block");
         
	            try {
	                int a = 10 / 0;
	                System.out.println(a);
	            } catch (ArithmeticException e) {
	                System.out.println("Cannot divide by zero");
	                e.printStackTrace();
	            }
	            
	            int[] arr= {10,20,30};
	            System.out.println(arr[5]);

      }catch(ArrayIndexOutOfBoundsException e){
		System.out.println("end");
		e.printStackTrace();
	}
		
	}

}
