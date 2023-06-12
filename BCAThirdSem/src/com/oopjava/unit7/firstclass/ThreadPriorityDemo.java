package com.oopjava.unit7.firstclass;

public class ThreadPriorityDemo  extends Thread{

	public void run() {
		
		System.out.println("Thread Name : "+Thread.currentThread().getName());
		System.out.println("Priority : "+Thread.currentThread().getPriority());
	}
	
	public static void main(String[] args) {
		ThreadPriorityDemo thread1 = new ThreadPriorityDemo();
		//max priority
		thread1.setPriority(10);
		thread1.setName("Texas...");
		thread1.start();
		
		ThreadPriorityDemo thread2 = new ThreadPriorityDemo();
		//min priority
		thread2.setPriority(1);
		thread2.setName("College...");
		thread2.start();
	}
}
