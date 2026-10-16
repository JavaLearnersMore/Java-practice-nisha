package com.prctice.collection.curser;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList <String> list = new ArrayList<>();
		list.add("apple");
		list.add("mango");
	 list.add("banana");
	 
	 ListIterator<String> l=list.listIterator();
	 
	 System.out.println("forward");
	 
	 while(l.hasNext()) {
		 System.out.println(l.next());
		 
	 }
	 System.out.println("backword");
	
	 while(l.hasPrevious()) {
		 String fruit = l.previous();
		 System.out.println(fruit);
		 
		 if (fruit.equals("mango")) {
             System.out.println("Mango found!");
         }
		 
	 }
	
		
	}

}
