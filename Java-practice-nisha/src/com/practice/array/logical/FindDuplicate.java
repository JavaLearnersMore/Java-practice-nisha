package com.practice.array.logical;

public class FindDuplicate {

	public static void main(String[] args) {
		
		int[] arr= {34,67,23,53,34,67,89};
		
		for(int i=0;i<=arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
			
				if(arr[i]==arr[j]) {
					
					System.out.println(arr[i]);
				}
			}
			
		  }

	}

}
