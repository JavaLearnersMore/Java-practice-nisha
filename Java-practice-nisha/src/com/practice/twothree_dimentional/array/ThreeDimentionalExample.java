package com.practice.twothree_dimentional.array;

public class ThreeDimentionalExample {

	public static void main(String[] args) {

        int[][][] arr = new int[2][3][3];

        arr[0][0][0] = 32;
        arr[0][1][1] = 6;
        arr[0][2][2] = 2;

        arr[1][0][0] = 45;
        arr[1][1][1] = 22;
        arr[1][2][2] = 37;

        for (int[][] x : arr) {
            for (int[] y : x) {
                for (int z : y) {
                    System.out.print(z + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
	

        
//        
//        int[][][] number= {
//        		{
//        		    {10,20},
//        		    {30,40}
//        		},
//        		{
//        			{20,40},
//        			{90,40}
//        		}
//            };
//        System.out.println(number[0][1][1]);  //layer,row,coloum

        	
	


