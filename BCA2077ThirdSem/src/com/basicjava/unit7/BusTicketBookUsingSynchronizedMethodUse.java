package com.basicjava.unit7;

public class BusTicketBookUsingSynchronizedMethodUse extends Thread {
	
	static BusTicketBookUsingSynchronizedMethod book;
	int seats;
	
	public void run() {
		book.bookTicket(seats);
	}
	
	public static void main(String[] args) {
	
		book = new BusTicketBookUsingSynchronizedMethod();
		BusTicketBookUsingSynchronizedMethodUse thread1 = new BusTicketBookUsingSynchronizedMethodUse();
		thread1.seats = 30;
		
		BusTicketBookUsingSynchronizedMethodUse thread2 = new BusTicketBookUsingSynchronizedMethodUse();
		thread2.seats = 12;

		thread1.start();
		thread2.start();
		
		
		
		
	}

}
