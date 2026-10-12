package com.practice.exception.checked;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ChekedExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//FileNotfoundException
		
		try {
			FileInputStream file=new FileInputStream("abc.text");
			System.out.println("file found");
			file.close();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("file not found");
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		//ClassNotFoundException
		try {
			Class.forName("Employee");
			System.out.println("class found");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("class not found");
		}
		
		
		//SqlException 
		
		try {
			Connection conn=DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/student_db",
	                "user",
	                "wrong"
	            );
			
			System.out.println("connected to the sql successfully");
		}catch(SQLException e) {
			System.out.println("can not connect database");
			e.printStackTrace();
		}
		
		//InterruptedException
		
		try {
			Thread.sleep(600);
			System.out.println("hello");
		}catch(InterruptedException e) {
			e.printStackTrace();
		}

	}

}
