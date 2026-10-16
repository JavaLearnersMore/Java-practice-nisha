package com.practice.map;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		LinkedHashMap<Integer ,String> list =new LinkedHashMap<>();
		
		list.put(1,"nisha");
		list.put(null,"nisha");
		list.put(3,"mayur");
		list.put(2,"ankita");
		list.put(3, "sneha");
		list.put(4, null);
		
		System.out.println(list);
		
		list.remove(2);
		System.out.println(list);
		
		System.out.println(list.containsValue("nisha"));
		System.out.println(list.containsKey(4));
	}

}
