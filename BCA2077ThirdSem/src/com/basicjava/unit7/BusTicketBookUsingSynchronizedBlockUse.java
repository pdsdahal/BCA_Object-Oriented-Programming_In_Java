package com.basicjava.unit7;

public class BusTicketBookUsingSynchronizedBlockUse extends Thread {
	
	static BusTicketBookUsingSynchronizedBlock book;
	int seats;
	
	public void run() {
		book.bookTicket(seats);
	}
	
	public static void main(String[] args) {
	
		book = new BusTicketBookUsingSynchronizedBlock();
		BusTicketBookUsingSynchronizedBlockUse thread1 = new BusTicketBookUsingSynchronizedBlockUse();
		thread1.seats = 30;
		
		BusTicketBookUsingSynchronizedBlockUse thread2 = new BusTicketBookUsingSynchronizedBlockUse();
		thread2.seats = 12;

		thread1.start();
		thread2.start();
		
		
		
		
	}

}
