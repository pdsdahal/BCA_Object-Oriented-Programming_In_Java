package com.basicjava.unit5;

public class BuiltInExceptionUncheckedDemo {

	public static void main(String[] args) {

		//ArithmeticException 
		int num1 = 10;
		int num2 = 0;
		System.out.println("Start");

		try {
			int result = num1 / num2;
			System.out.println("Result : " + result);
		} catch (ArithmeticException ex) {

			System.out.println(ex.getMessage());
		}
		System.out.println("End");
		
		//null pointer exception 
		
		String collegeName = null;
		try {
		int legth = collegeName.length();
		System.out.println("Length : "+legth);
		}catch(NullPointerException ex) {
			System.out.println(ex.getMessage());
		}
		
		//NumberFormatException
		
		String data = "Ram";
		try {
			int dataNum = Integer.valueOf(data);
			System.out.println("Data : "+dataNum);
				
		}catch(NumberFormatException e) {
			System.out.println(e.getMessage());
		}
		
		
		//Use try catch block to handle ---ArrayIndexOutOfBoundsException
		int[] dataArra = {1,2,3,4,5};
		
		System.out.println(dataArra[5]);
		
	}
}
