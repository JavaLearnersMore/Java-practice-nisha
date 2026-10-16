package com.practice.comparable.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class CustomerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Customer>list=new ArrayList<>();
		list.add(new Customer(2,"ankita",20000.00));
		list.add(new Customer(3,"nisha",10000.00));
		list.add(new Customer(1,"mayur",40000.00));
		list.add(new Customer(4,"kavita",40000.00));
		
		System.out.println("before sorting ");
		for(Customer c:list){
			System.out.println(c);
			}
		
		MyComparator m=new MyComparator();
		Collections.sort(list,m);
		
		System.out.println("after sorting ");

		for(Customer c:list){
			System.out.println(c);
			}
	}

}
