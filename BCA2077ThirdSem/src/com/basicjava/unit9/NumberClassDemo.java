package com.basicjava.unit9;

public class NumberClassDemo {

	public static void main(String[] args) {

		Number num1 = 345678.5678;
		
		Integer num2Integer = (Integer) num1;
		Double num2Double = (Double) num1;
		Long num2Long = (Long) num1;
		
		double num1PrimitiveDouble  = num1.doubleValue();
		float num1PrimitiveFloat = num1.floatValue();
		int num1PrimitiveInt = num1.intValue();
		

		int byteNum2Integer = num2Integer.byteValue();
		
	}
}
