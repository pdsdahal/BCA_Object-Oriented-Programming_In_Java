package com.oopjava.unit7.secondclass.staticsynchronization;

public class Thread2 extends Thread{
	
	private BusTicketBook busTicketBook;
	private int seats;
	
	public Thread2(BusTicketBook busTicketBook, int seats) {
		this.busTicketBook = busTicketBook;
		this.seats = seats;
	}

	public void run() {
		busTicketBook.bookSeat(seats);
	}
}
