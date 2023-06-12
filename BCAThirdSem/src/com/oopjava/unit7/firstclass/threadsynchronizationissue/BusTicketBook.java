package com.oopjava.unit7.firstclass.threadsynchronizationissue;

public class BusTicketBook {
	
	int seatCapcity = 35;
	
	public void bookSeat(int numberOfSeats) {
		
		if(seatCapcity >= numberOfSeats) {
			System.out.println("Ticket Booked : "+numberOfSeats);
			seatCapcity = seatCapcity - numberOfSeats;
			System.out.println("Seat Left : "+seatCapcity);
		}else {
			System.out.println("Failed to booked ticket. "+numberOfSeats);
			System.out.println("Seat Left : "+seatCapcity);
		}
	}
}
