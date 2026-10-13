package com.practice.thread.syncronization;

public class B extends Thread {

	public void run() {
		synchronized (A.lock2) {
			System.out.println("Thread B lock 2");
		}
			try {
				Thread.sleep(3000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
			synchronized (A.lock1) {
		
			
			}
		}
}
