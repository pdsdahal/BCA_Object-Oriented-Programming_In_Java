package com.oopjava.unit7.firstclass;

public class ThreadCreationUsingExtend extends Thread {
	
	public void run() {
		System.out.println("Inside the thread....");
		System.out.println("Name : "+Thread.currentThread().getName());
		System.out.println("Priority : "+Thread.currentThread().getPriority());
		
	}
	
	
	public static void main(String[] args) {
		
	
		System.out.println("Name : "+Thread.currentThread().getName());
		System.out.println("Priority : "+Thread.currentThread().getPriority());
		
		ThreadCreationUsingExtend thread1 = new ThreadCreationUsingExtend();
		thread1.setName("Thread - 1");
		thread1.start();
		
		ThreadCreationUsingExtend thread2 = new ThreadCreationUsingExtend();
		thread2.setName("Thread - 2");
		thread2.start();
		
	}
}
