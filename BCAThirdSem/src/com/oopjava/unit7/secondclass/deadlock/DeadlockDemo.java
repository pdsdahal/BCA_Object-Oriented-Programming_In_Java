package com.oopjava.unit7.secondclass.deadlock;

public class DeadlockDemo {

	public static void main(String[] args) {

		Object resource1 = "Texas College";
		Object resource2 = "ABC College";

		Thread thread1 = new Thread() {

			public void run() {
				synchronized (resource1) {
					System.out.println("Thread 1 locked resource 1");

					synchronized (resource2) {
						System.out.println("Thread 1 locked resource 2");

					}
				}
			}
		};

		Thread thread2 = new Thread() {

			public void run() {
				synchronized (resource2) {
					System.out.println("Thread 2 locked resource 2");
					synchronized (resource1) {
						System.out.println("Thread 2 locked resource 1");

					}
				}
			}
		};

		thread1.start();
		thread2.start();

	}
}
