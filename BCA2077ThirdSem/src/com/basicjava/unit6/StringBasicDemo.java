package com.basicjava.unit6;

public class StringBasicDemo {

	public static void main(String[] args) {
		String collegeName = "Texas International ";
		
		String fullCollegeName = collegeName.concat("College");
		System.out.println(fullCollegeName);
		
		
		//String creation by using new keyword
		
		String data = new String("Ram Panday");
		System.out.println("Name : "+data);
	}
}
