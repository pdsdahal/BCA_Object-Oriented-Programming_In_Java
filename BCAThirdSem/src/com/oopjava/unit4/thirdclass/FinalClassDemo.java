package com.oopjava.unit4.thirdclass;

//final class
public final class FinalClassDemo {

	//final variable
	final double pi = 3.14;
	
	//final method
	public final void findAreOfCircle(double r) {
		double area = pi* r*r;
		System.out.println("Are of circle : "+area);
	}
	
	public static void main(String[] args) {
		FinalClassDemo demo = new FinalClassDemo();
		demo.findAreOfCircle(5);
		
	}
}
