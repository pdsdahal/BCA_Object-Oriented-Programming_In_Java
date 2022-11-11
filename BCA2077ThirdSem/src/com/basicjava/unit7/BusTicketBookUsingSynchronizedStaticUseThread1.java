package com.basicjava.unit7;

public class BusTicketBookUsingSynchronizedStaticUseThread1 extends Thread {
	
	BusTicketBookUsingSynchronizedStatic book;
	int seats;
	
	public BusTicketBookUsingSynchronizedStaticUseThread1(BusTicketBookUsingSynchronizedStatic book, int seats) {
		this.book = book;
		this.seats = seats;
	}
	
	public void run() {
		book.bookTicket(seats);
	}
}
