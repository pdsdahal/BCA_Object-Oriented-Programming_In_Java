package com.basicjava.unit7;

public class BusTicketBookUsingSynchronizedStaticUseThread2 extends Thread {

	BusTicketBookUsingSynchronizedStatic resource;
	int seats;
	
	public BusTicketBookUsingSynchronizedStaticUseThread2(BusTicketBookUsingSynchronizedStatic resource, int seats) {
	
		this.seats = seats;
		this.resource = resource;
	}
	
	public void run() {
		resource.bookTicket(seats);
	}
}
