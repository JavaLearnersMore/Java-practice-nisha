package com.practice.map;

import java.util.HashMap;

public class HasMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer ,String> list =new HashMap<>();
		
		list.put(1,"nisha");
		list.put(null,"nisha");
		list.put(3,"mayur");
		list.put(2,"ankita");
		list.put(3, "sneha");
		list.put(4, null);
		
		System.out.println(list);
		
		list.remove(2);
		System.out.println(list);
		
		
	}

}
