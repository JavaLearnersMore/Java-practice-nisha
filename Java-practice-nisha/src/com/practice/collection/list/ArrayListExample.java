package com.practice.collection.list;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list =new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(10);
		list.add(60);
		
      System.out.println(list);
      
      list.remove(2);
      System.out.println(list);
     
      System.out.println(list.contains(10));
      
      list.set(0,50);
      System.out.println(list);
      
      System.out.println(list.get(0));
      System.out.println(list.size());
      
      for(int i=0;i<list.size();i++) {
    	  System.out.println(list.get(i));
      }
	}

}
