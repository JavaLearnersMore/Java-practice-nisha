package com.practice.collection.list;

import java.util.Stack;
import java.util.Vector;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> list =  new Stack<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(10);
		list.add(60);
		
      System.out.println(list);
      
      list.push(70);
      System.out.println(list);
      
      list.pop();
      System.out.println(list);
    
      list.addElement(200);
      System.out.println(list);
      
      System.out.println(list.contains(200));
	}

}
