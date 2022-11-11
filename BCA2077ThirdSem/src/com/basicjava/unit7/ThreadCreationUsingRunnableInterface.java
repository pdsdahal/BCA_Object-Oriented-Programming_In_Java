package com.basicjava.unit7;

public class ThreadCreationUsingRunnableInterface implements Runnable {

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

		
		ThreadCreationUsingRunnableInterface obj = new ThreadCreationUsingRunnableInterface();
		Thread thread1 = new Thread(obj);
		thread1.setName("Display");
		thread1.start();
		
		
		
	}
}
