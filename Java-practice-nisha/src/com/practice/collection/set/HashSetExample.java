package com.practice.collection.set;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> list=new HashSet<>();
		
		list.add("Ankita");
		list.add("Nisha");
		list.add("Nikhil");
		list.add("Prakash");
		
		System.out.println(list);
		
		list.add("nita");
		list.add(null);
		list.add("");
		list.add(null);
		System.out.println(list);
		
		list.remove("");
		System.out.println(list);
		
		
		System.out.println(list.size());

	}

}
