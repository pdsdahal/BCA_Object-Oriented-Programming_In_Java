package com.oopjava.unit5.firstclass;

public class ExeptionDemo {

	
	public static void main(String[] args) {
		
		//compile time Exception -- Checked Exception 
		//Class.forName("classexample.jaava");
		
		
		//run time exception --UnChecked Exception 
		
		String data = null;
		int length = data.length();
		System.out.println("Length : "+length);
		
	}
}
