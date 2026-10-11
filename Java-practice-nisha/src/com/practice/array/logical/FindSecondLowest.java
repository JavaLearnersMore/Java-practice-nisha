package com.practice.array.logical;

public class FindSecondLowest {

	public static void main(String[] args) {
	
		int[] arr= {45,34,22,12,41,90};
		   int Lowest = Integer.MAX_VALUE;
	        int SecondLowest = Integer.MAX_VALUE;
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i] < Lowest) {
				SecondLowest=Lowest;
				Lowest=arr[i];
				
				}
		}

		System.out.println("Lowest is :" +Lowest);
		System.out.println("Second Lowest is :" +SecondLowest);
	}

}
