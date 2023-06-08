package com.oopjava.unit5.secondclass;

public class MultiCatchDemo {

	public static void main(String[] args) {

		int num1 = 100;
		int num2 = 2;
		
		
		try {
			String data = null;
			int div = num1 / num2;//100/2
			System.out.println(num1 + " / " + num2 + " = " + div);
			
			int apple = data.length();
			System.out.println("Length of String : "+apple);
		} catch (ArithmeticException  | NullPointerException e) {
			System.out.println("Exception Reason : "+e.getMessage());
		}
	}

}
