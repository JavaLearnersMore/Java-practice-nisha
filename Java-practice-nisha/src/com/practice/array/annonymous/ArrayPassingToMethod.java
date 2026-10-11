package com.practice.array.annonymous;

public class ArrayPassingToMethod {
	private static void display(int[] arr) {
		for(int i=0;i<arr.length;i++) {
        System.out.println(arr[i]);
		}	
		
	}

	 public static void main(String[] args) {
  int[]number = {10,20,30};
    display(number);

	}

}
