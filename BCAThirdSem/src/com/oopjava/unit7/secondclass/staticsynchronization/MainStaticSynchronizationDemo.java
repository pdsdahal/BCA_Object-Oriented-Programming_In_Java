package com.oopjava.unit7.secondclass.staticsynchronization;

public class MainStaticSynchronizationDemo {

	public static void main(String[] args) {
		BusTicketBook busTicketBook = new BusTicketBook();
		
		Thread1 thread1 = new Thread1(busTicketBook, 10);
		thread1.start();
		
		Thread2 thread2 = new Thread2(busTicketBook, 25);
		thread2.start();
		
		//copy above code 
		BusTicketBook busTicketBook1 = new BusTicketBook();
		
		Thread1 thread3 = new Thread1(busTicketBook1, 15);
		thread3.start();
		
		Thread2 thread4 = new Thread2(busTicketBook1, 25);
		thread4.start();
		
		
	}
}
