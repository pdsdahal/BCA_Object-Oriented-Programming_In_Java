package com.basicjava.unit7;

public class ThreadPriority extends Thread {

	public void run() {
		
		Thread.currentThread().setPriority(1);
		System.out.println("Custom : "+Thread.currentThread().getPriority());
		
	}
	
	public static void main(String[] args) {
		
		int mainThreadPriority = Thread.currentThread().getPriority();
		System.out.println("Main Thread Priority : "+mainThreadPriority);
		Thread.currentThread().setPriority(10);
		int mainThreadPriorityChange = Thread.currentThread().getPriority();
		
		System.out.println("Main Thread Priority After Changed: "+mainThreadPriorityChange);
		
		
		ThreadPriority thredPriority = new ThreadPriority();
		thredPriority.start();
		
	}
}
