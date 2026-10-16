package com.practice.comparable.comparator;

import java.util.Comparator;

public class MyComparator implements Comparator<Customer>{

	@Override
	public int compare(Customer c1, Customer c2) {
		// TODO Auto-generated method stub
		return Integer.compare(c1.getId(), c2.getId());
	}

}
