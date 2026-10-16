package com.practice.collection.list;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> list =new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(10);
		list.add(60);
		
		System.out.println(list);
		
		list.addFirst(100);
		System.out.println(list);
		

		list.removeLast();
		System.out.println(list);
		
	System.out.println(list.isEmpty());
	System.out.println(list.iterator());
	
	System.out.println(list.contains(20));
		
	}

}
