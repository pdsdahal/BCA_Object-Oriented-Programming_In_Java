package com.basicjava.unit7;

public class BusTicketBookUsingSynchronizedStaticMain {

	public static void main(String[] args) {

		BusTicketBookUsingSynchronizedStatic resource1 = new BusTicketBookUsingSynchronizedStatic();

		BusTicketBookUsingSynchronizedStaticUseThread1 t1 = new BusTicketBookUsingSynchronizedStaticUseThread1(
				resource1, 10);
		t1.start();

		BusTicketBookUsingSynchronizedStaticUseThread2 t2 = new BusTicketBookUsingSynchronizedStaticUseThread2(
				resource1, 30);
		t2.start();
		
		//

		BusTicketBookUsingSynchronizedStatic resource2 = new BusTicketBookUsingSynchronizedStatic();

		BusTicketBookUsingSynchronizedStaticUseThread1 t3 = new BusTicketBookUsingSynchronizedStaticUseThread1(
				resource2, 15);
		t3.start();

		BusTicketBookUsingSynchronizedStaticUseThread2 t4 = new BusTicketBookUsingSynchronizedStaticUseThread2(
				resource2, 40);
		t4.start();

	}
}
