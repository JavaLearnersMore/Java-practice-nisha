package com.practice.thread.method;

public class Mythread extends Thread{
	
	public void run() {
		
		for(int i=1;i<10;i++) {
			System.out.println("THread 1 :"+i);
			
			try {
				Thread.sleep(5000);
				
			}catch(InterruptedException e) {
		
			}
			
			System.out.println("end");
		}
	}

}
