package com.practice.array.logical;

public class RemoveZeroAtLast {

	public static void main(String[] args) {
		
		int[] arr= {1,0,2,3,4,0,5,0,6,0};
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i] == 0) {
				
				for(int j=i+1;j<arr.length;j++) {
					
					if(arr[j] != 0) {
						
						arr[i] = arr[j];
                        arr[j] = 0;
                        break;
					}
				}
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
