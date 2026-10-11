package com.practice.array.annonymous;

public class AnnonymousArrayExample {

	public static void main(String[] args) {
		 Sum( new int[] {10,20,30,40});

	}

	private static void Sum(int[] x) {
		
		int total=0;
		for(int x1:x) {
			total=total+x1;
		}
		System.out.println(total);
		
		
	}

}
