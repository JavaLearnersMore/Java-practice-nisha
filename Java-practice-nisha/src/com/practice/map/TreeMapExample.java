package com.practice.map;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		TreeMap<Integer ,String> list =new TreeMap<>();
		
		list.put(1,"nisha");
		list.put(7,"nisha");
		list.put(4,"mayur");
		list.put(2,"ankita");
		list.put(3, "sneha");
		list.put(5, null);
		
		System.out.println(list);
		
		list.remove(2);
		System.out.println(list);
		
		System.out.println(list.containsValue("nisha"));
		System.out.println(list.containsKey(8));
		
	}
	

}
