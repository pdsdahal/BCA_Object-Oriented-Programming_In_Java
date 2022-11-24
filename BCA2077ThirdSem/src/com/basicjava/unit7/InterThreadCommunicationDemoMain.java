package com.basicjava.unit7;

public class InterThreadCommunicationDemoMain {

	public static void main(String[] args) {

		InterThreadCommunicationDemo t1 = new InterThreadCommunicationDemo();
		t1.start();
		try {
			synchronized (t1) {
				t1.wait();
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		int sum = t1.getTotalSum();
		System.out.println("sum is : " + sum);
	}
}
