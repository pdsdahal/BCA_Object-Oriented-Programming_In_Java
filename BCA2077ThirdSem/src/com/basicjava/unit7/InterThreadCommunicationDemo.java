package com.basicjava.unit7;

public class InterThreadCommunicationDemo extends Thread {

	int totalSum = 0;

	public void run() {

		synchronized (this) {
			for (int i = 0; i < 10; i++) {
				totalSum = totalSum + 100;
			}

			this.notify();
		}

	}

	public int getTotalSum() {
		return totalSum;
	}
}
