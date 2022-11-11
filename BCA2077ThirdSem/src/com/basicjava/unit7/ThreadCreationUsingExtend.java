package com.basicjava.unit7;

public class ThreadCreationUsingExtend extends Thread {
	
	public void run() {
	
		long id = Thread.currentThread().getId();
		String name = Thread.currentThread().getName();
		System.out.println("Id : "+id);
		System.out.println("Name : "+name);
		System.out.println("Inside run method");
	}

	public static void main(String[] args) {
		

		long id = Thread.currentThread().getId();
		String name = Thread.currentThread().getName();
		System.out.println("Id : "+id);
		System.out.println("Name : "+name);
		
		
		ThreadCreationUsingExtend thread1 = new ThreadCreationUsingExtend();
		thread1.start();
		
	}
}
