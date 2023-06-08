package com.oopjava.unit5.secondclass;

public class ThrowsDemo {

	public void showTexasCollege(String collegeAddress, int collegeDeparmentNo) throws NullPointerException, ArithmeticException, ArrayIndexOutOfBoundsException  {
		
		int lenght = collegeAddress.length();
		System.out.println("Length of college address is : "+lenght);
		System.out.println("Address : "+collegeAddress);
		System.out.println("Department No : "+collegeDeparmentNo);
	}
	
	
	public static void main(String[] args) {
	
		ThrowsDemo demo = new ThrowsDemo();
		try {
		demo.showTexasCollege(null, 12345);
		}catch(NullPointerException | ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("Rason : "+e.getMessage());
		}
	}
}
