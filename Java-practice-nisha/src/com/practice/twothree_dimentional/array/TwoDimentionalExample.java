package com.practice.twothree_dimentional.array;

public class TwoDimentionalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] a= new int[2][4];
		
		a[0][0]=1;
		a[0][1]=9;
	    a[0][2]=6;
	    a[0][3]=4;
	    
	    a[1][0]=12;
		a[1][1]=8;
		a[1][2]=5;
	    a[1][3]=45;
	    
	    System.out.println(a[0][3]);
	    for(int[] x:a) {
	    	
	    	for(int y:x) {
	    		 System.out.print(y + " ");
	    	}
	    	
	    }
	   
	    
//    int[][] marks= {
//		{90,89,69},
//		{78,90,45},
//		{78,97,90}
//};
//  System.out.println(marks[1][2] );
//  System.out.println(marks[2][1] );
//  System.out.println(marks[0][0] );
		
	}

}
