package com.oopjava.unit6.firstclass;

public class ConversionOfStringDemo {

	public static void main(String[] args) {
		
		//String type to primitive type 
		String data = "23456";
		int dataInInt = Integer.parseInt(data);
		System.out.println("Convrsion from String to Int : "+dataInInt);
		
		String data1 = "23456.56789";
		double dataInDouble = Double.parseDouble(data1);
		System.out.println("Convrsion from String to Double : "+dataInDouble);
		
		//primitive type to String type conversion 
		int num1 = 1234;
		String num1ToString = String.valueOf(num1);
		System.out.println("Conversion from int to String : "+num1ToString);
		
		double salary = 345.567;
		String salaryToString = String.valueOf(salary);
		System.out.println("Conversion from double to String : "+salaryToString);
		
		//toString 
		Object object = 1234567;
		String objectToString = object.toString();
		System.out.println("Conversion from object to String : "+objectToString);
	}
}
