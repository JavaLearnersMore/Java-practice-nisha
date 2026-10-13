package com.practice.thread.method;

public class ClassRoomMain {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ClassRoom c=new ClassRoom();
		
		Thread t=new Thread(new Runnable() {
			public void run() {
				c.studentWait();
			}
			
		});
		

		Thread t1=new Thread(new Runnable() {
			public void run() {
				c.studentWait();
			}
			
		});
		t.start();
		t1.start();
		
		Thread.sleep(5000);
		
		c.teacherNotify();
	}

}
