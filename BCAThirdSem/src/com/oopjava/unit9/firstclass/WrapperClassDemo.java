package com.oopjava.unit9.firstclass;

public class WrapperClassDemo {

	public static void main(String[] args) {
		
		//auto boxing - Conversion of primitive type to Wrapper Type 
		int data = 100;
		Integer dataResult = data;
		
		double data1 = 23.67;
		Double data1Result = data1;
		
		System.out.println("int to Integer : "+dataResult);
		System.out.println("double to Double : "+data1Result);
		
	
		//unboxing - Conversion of Wrapper type to primitive Type 
		
		Double data2 = 5678.78;
		double data2Result = data2;
		
		System.out.println("Double to double : "+data2Result);
	}
	
}
