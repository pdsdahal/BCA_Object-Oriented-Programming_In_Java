package com.oopjava.unit9.firstclass;

public class NumberClassDemo {

	public static void main(String[] args) {

		// Number
		Number data1 = 1234;

		System.out.println(data1.intValue());
		System.out.println(data1.doubleValue());
		System.out.println(data1.byteValue());
		System.out.println(data1.floatValue());
		System.out.println(data1.toString());

		// Double
		Double data3 = 237.89;

		System.out.println(data3.intValue());
		System.out.println(data3.doubleValue());
		System.out.println(data3.byteValue());
		System.out.println(data3.floatValue());
		System.out.println(data3.toString());

		// Float
		Float data4 = 237.89f;

		System.out.println("convert Float to int : " + data4.intValue());
		System.out.println("convert Float to double : " + data4.doubleValue());
		System.out.println("convert Float to byte : " + data4.byteValue());
		System.out.println("convert Float to float : " + data4.floatValue());
		System.out.println("convert Float to String : " + data4.toString());

		// Boolean
		Boolean data5 = true;
		System.out.println("convert Boolean to boolean : " + data5.booleanValue());
		System.out.println("convert Boolean to String : " + data5.toString());
		
		// Character
		Character data6 = 'a';
		System.out.println("convert Character to char : " + data6.charValue());
		System.out.println("convert Character to String : " + data6.toString());


	}
}
