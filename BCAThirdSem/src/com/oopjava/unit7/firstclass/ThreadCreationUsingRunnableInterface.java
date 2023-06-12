package com.oopjava.unit7.firstclass;

public class ThreadCreationUsingRunnableInterface implements Runnable {

	public void run() {
		System.out.println("Inside the run method : ");
		System.out.println("Name : "+Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		
		String threadName = Thread.currentThread().getName();
		System.out.println("Name : "+threadName);
		
		ThreadCreationUsingRunnableInterface resourceObj = new ThreadCreationUsingRunnableInterface();
		Thread t1 = new Thread(resourceObj);
		t1.setName("Thread-1");
		t1.start();
		
		ThreadCreationUsingRunnableInterface resourceObj1 = new ThreadCreationUsingRunnableInterface();
		Thread t2 = new Thread(resourceObj1);
		t2.setName("Thread-2");
		t2.start();
	}

}
