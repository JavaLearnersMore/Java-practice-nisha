package com.practice.collection.set;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
        TreeSet<String> list=new TreeSet<>();
		
		list.add("Ankita");
		list.add("Nisha");
		list.add("Nikhil");
		list.add("Prakash");
		
		System.out.println(list);
		
		list.add("Asmita");
		list.add("Mayur");
		list.add("Arnav");
		list.add("Zain");
		System.out.println(list);
		
		System.out.println(list.isEmpty());
		System.out.println(list.contains("Ankita"));
		
		list.remove("mayur");
		System.out.println("after remove mayur:" +list);
	}

}
