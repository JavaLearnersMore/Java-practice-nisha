package com.practice.collection.list;

import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<Integer> list =  new Vector<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(10);
		list.add(60);
		
      System.out.println(list);
      
      list.addElement(100);
      System.out.println(list);
      
      list.removeElement(100);
      System.out.println(list);
    
      System.out.println(list.isEmpty());

	}

}
