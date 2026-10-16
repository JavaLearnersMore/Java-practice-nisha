package com.prctice.collection.curser;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class IteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		ArrayList<String> v =new ArrayList<>();
		
		v.add("apple");
		v.add("mango");
		v.add("banana");
		
		Iterator<String> e=v.iterator();
		while(e.hasNext()) {
		String fruit=e.next();
		
		if (fruit.equals("banana")) {
            e.remove();
        }
		
	}
        System.out.println(v);

	}

}
