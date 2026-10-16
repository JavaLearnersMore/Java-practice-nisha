package com.practice.collection.queue;

import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> list=new PriorityQueue<>();
		list.add(10);
		list.add(9);
		list.add(20);
		list.add(1);
		
		System.out.println(list);
		
		list.offer(15);
		list.offer(25);
		list.add(19);
		System.out.println(list);

		
		while (!list.isEmpty()) {
	            System.out.println(list.poll());
	      }
	}

}
