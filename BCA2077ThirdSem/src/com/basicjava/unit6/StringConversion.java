package com.basicjava.unit6;

public class StringConversion {

	public static void main(String[] args) {
		//String.valueOf demo
		int data1 = 34;
		System.out.println("Int value : "+data1);
		
		String data2 = String.valueOf(data1);
		System.out.println("String value : "+data2);
		
		boolean data3  = true;
		String data4 = String.valueOf(data3);
		
		char[] charArray = {'T','e','x','a','s'};
		String result = String.valueOf(charArray);
		System.out.println("Result : "+result);
		
		
		//toString demo
		
		Integer number = 12;
		String numberInString = number.toString();
		System.out.println(numberInString);
		
		String doubleInString = Double.toString(343.67);
		
		
		//parse 
		
		String number4 = "400";
		int intNumber4 = Integer.parseInt(number4);
		System.out.println("Number 4 using parse : "+intNumber4);
		
		String number5 = "5678.5678";
		double number5Indouble =  Double.parseDouble(number5);
		System.out.println("Double : "+number5Indouble);
		
	}
}
