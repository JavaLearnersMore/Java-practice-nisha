package com.practice.constuctor;

public class CopyConstructorExample {
	int id;
	String name;
	CopyConstructorExample(int id,String name){
		this.id=id;
		this.name=name;
	}
	
	CopyConstructorExample(CopyConstructorExample c){
		this.id=c.id;
		this.name=c.name;
	}
	

	void display() {
		System.out.println(id+" "+name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyConstructorExample c=new CopyConstructorExample(1,"nisha");
		CopyConstructorExample c1=new CopyConstructorExample(c);
		c1.display();
		
		
	}

}
