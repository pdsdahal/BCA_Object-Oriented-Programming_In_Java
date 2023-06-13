package com.oopjava.unit7.secondclass.interthreadcommunication;

public class InterThreadCommunicationDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		FindSum findSum = new FindSum();
		
		findSum.start();
		
		synchronized (findSum) {
			findSum.wait();
		}
		
		int totalSum =  findSum.getTotalSum();
		System.out.println("sum : 0 to 100 : "+totalSum);
		
	}

}
