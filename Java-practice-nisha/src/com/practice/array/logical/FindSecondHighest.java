package com.practice.array.logical;

public class FindSecondHighest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1,4,23,54,76,90};
		
		int highest=0;
		int secondHighest=0;
		
		for(int i=0; i < arr.length; i++) {
			
			if(arr[i] > highest) {
				secondHighest=highest;
				highest=arr[i];
			}
			
//			else if(arr[i] > secondHighest && arr[i] !=highest) {
//				secondHighest=arr[i];
//			}
		}
		System.out.println("Highest: " + highest);
        System.out.println("Second highest: " + secondHighest);

	}

}
