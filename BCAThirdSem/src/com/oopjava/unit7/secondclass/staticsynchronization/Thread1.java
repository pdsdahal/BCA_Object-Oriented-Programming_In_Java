package com.oopjava.unit7.secondclass.staticsynchronization;

public class Thread1 extends Thread{
	
	private BusTicketBook busTicketBook;
	private int seats;
	
	public Thread1(BusTicketBook busTicketBook, int seats) {
		this.busTicketBook = busTicketBook;
		this.seats = seats;
	}

	public void run() {
		busTicketBook.bookSeat(seats);
	}
}
