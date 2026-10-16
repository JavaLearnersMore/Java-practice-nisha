package com.practice.oops.encapsulation;

public class Encapsulation {

		 private String name;
		
		public String getname() {
			return name;
		}
		
		public void setname(String name) {
			this.name = name;
			
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
		
		Encapsulation e=new Encapsulation();
		e.setname("nisha");
	System.out.println(e.getname());
		

	}

}
