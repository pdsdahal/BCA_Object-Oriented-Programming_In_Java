package com.oopjava.unit7.secondclass.interthreadcommunication;

public class FindSum extends Thread {

	int totalSum = 0;

	public void run() {

		synchronized (this) {
			for (int i = 0; i < 100; i++) {
				totalSum = totalSum + i;
			}
			notify();
		}
	}

	public int getTotalSum() {
		return totalSum;
	}

}
