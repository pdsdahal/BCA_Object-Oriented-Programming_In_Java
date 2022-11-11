package com.basicjava.unit7;

public class BusTicketBookUsingSynchronizedBlock {

	int total_seats = 35;

	public void bookTicket(int seats) {

		System.out.println("Bus No : 1234");
		System.out.println("Driver Name : Dipu Panday");
		System.out.println("Driver PhoneNo : 12345678");

		synchronized (this) {
			if (total_seats >= seats) {
				System.out.println("Ticket Booked Successfully! " + seats);
				total_seats = total_seats - seats;
				System.out.println("Seat Left : " + total_seats);
			} else {
				System.out.println("Failed to booked : " + seats);
				System.out.println("Seat Left : " + total_seats);
			}
		}
	}
}