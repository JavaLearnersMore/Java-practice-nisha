package com.practice.comparable.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> list=new ArrayList<>();
		
		list.add(new Employee(2,"ankita",20000.00));
		list.add(new Employee(3,"nisha",10000.00));
		list.add(new Employee(1,"mayur",40000.00));
		list.add(new Employee(4,"kavita",40000.00));
		
		Collections.sort(list);
		
		for(Employee e:list) {
			System.out.println(e);
		}
		

	}

}
