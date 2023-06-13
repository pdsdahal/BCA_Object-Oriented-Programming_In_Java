package com.oopjava.unit7.secondclass.staticsynchronization;

public class BusTicketBook {

	static int totalSeat = 30;

	static synchronized public void bookSeat(int reqSeat) {

		if (totalSeat >= reqSeat) {
			System.out.println("Ticket Booked : " + reqSeat);
			totalSeat = totalSeat - reqSeat;
			System.out.println("Seat left : " + totalSeat);
		} else {
			System.out.println("Failed to Booked! : "+reqSeat);
			System.out.println("Seat left : " + totalSeat);
		}
	}

}
