package com.practice.array.logical;

public class HighestTwoNumberSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {2,1,5,3,1,2,2,2,4,5,7};
	   int count=0;
	  
	  for(int i=0;i<arr.length;i++) {
		  
		  
		  for(int j=i+1;j<arr.length;j++) {
			  
			  System.out.println("Array i :"+arr[i]);
			  System.out.println("Array j :" +arr[j]);
			  if(arr[i]==arr[j]) {
//			
//		      int sum=0;
//			  sum = arr[i]+count;
//				  count=sum;
				  count++;
				}
			  
		  }
		
		 }
	  System.out.println(count);

	}
}

