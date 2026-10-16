package com.practice.collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class linkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Queue<String> list=new LinkedList<>();
		list.add("Ankita");
		list.add("Nisha");
		list.add("Nikhil");
		list.add("Prakash");
		
		System.out.println(list);
		
		list.offer("Mayur");
		list.offer("Sneha");
		System.out.println(list);
		
		//get first element
		System.out.println(list.element());
		
		System.out.println(list.contains("nita"));
		
		list.poll();
		System.out.println(list);
		
		list.peek();
		System.out.println(list);
		
		System.out.println(list.isEmpty());
		System.out.println(list.size());

	}

}
