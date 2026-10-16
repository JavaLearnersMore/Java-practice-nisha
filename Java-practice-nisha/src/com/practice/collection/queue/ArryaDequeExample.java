package com.practice.collection.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArryaDequeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Deque<Integer> list=new ArrayDeque<>();
		list.add(10);
		list.add(9);
		list.add(20);
		list.add(1);
		
		System.out.println(list);
		
		//add
		list.offer(15);
		list.offer(25);
		list.add(19);
		list.addFirst(3);
		list.addLast(50);
		System.out.println(list);
		
		//remove
		list.pollFirst();
		list.pollLast();
		System.out.println(list);
	}
	
	

}
