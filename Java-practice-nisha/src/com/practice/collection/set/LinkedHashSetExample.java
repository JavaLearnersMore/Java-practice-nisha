package com.practice.collection.set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
        LinkedHashSet<String> list=new LinkedHashSet<>();
		
		list.add("Ankita");
		list.add("Nisha");
		list.add("Nikhil");
		list.add("Prakash");
		
		System.out.println(list);
		
		list.add("Asmita");
		list.add("mayur");
		System.out.println(list);
		
		System.out.println(list.isEmpty());
		System.out.println(list.contains("Ankita"));
		
		list.remove("mayur");
		System.out.println("after remove mayur:" +list);
	}

}
