package com.basicjava.unit7;

public class BusTicketBookUsingSynchronizedStatic {
	
	static int total_seats = 35;
	
	static synchronized public void bookTicket(int seats) {
		if(total_seats >= seats) {
			System.out.println("Ticket Booked Successfully! "+seats);
			total_seats = total_seats - seats;
			System.out.println("Seat Left : "+total_seats);
		}else {
			System.out.println("Failed to booked : "+seats);
			System.out.println("Seat Left : "+total_seats);
		}
	}
}