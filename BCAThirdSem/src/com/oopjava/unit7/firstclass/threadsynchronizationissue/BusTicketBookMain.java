package com.oopjava.unit7.firstclass.threadsynchronizationissue;

public class BusTicketBookMain extends Thread {
	
	static BusTicketBook  busTicketBook;
	int seats;
	
	public void run() {
		busTicketBook.bookSeat(seats);
	}
	
	public static void main(String[] args) {
		
		busTicketBook = new BusTicketBook();
		
		BusTicketBookMain bookMain = new BusTicketBookMain();
		bookMain.seats  = 10;
		bookMain.start();
		
		BusTicketBookMain bookMain1 = new BusTicketBookMain();
		bookMain1.seats  = 20;
		bookMain1.start();
		
		BusTicketBookMain bookMain2 = new BusTicketBookMain();
		bookMain2.seats  = 20;
		bookMain2.start();
		
	}

}
