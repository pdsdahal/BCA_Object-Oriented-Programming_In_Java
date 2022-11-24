package com.basicjava.unit7;

public class DeadLockDemo {
	
	public static void main(String[] args) {
	
		Object resource1 = "Texas";
		Object resource2 = "College";
		
		Thread t1 = new Thread() {
			public void run() {
				synchronized (resource1) {
					System.out.println("Thread 1 locked resource 1");
					
					synchronized (resource2) {
						System.out.println("Thread 1 locked resource 2");
					}
				}
			}
		};
	
		Thread t2 = new Thread() {
			public void run() {
				synchronized (resource2) {
					System.out.println("Thread 2 locked resource 2");
					
					synchronized (resource1) {
						System.out.println("Thread 2 locked resource 1");
					}
			
				}
			}
		};
		
	
		t1.start();
		t2.start();
		
	}
}
