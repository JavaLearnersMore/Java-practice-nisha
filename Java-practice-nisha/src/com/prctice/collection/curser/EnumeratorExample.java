package com.prctice.collection.curser;

import java.util.Enumeration;
import java.util.Vector;

public class EnumeratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<String> v =new Vector<>();
		
		v.add("apple");
		v.add("mango");
		v.add("banana");
		
		Enumeration<String> e=v.elements();
		while(e.hasMoreElements()) {
		System.out.println(e.nextElement());
		
		
	}
	}

}
