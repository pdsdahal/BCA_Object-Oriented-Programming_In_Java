package com.basicjava.unit6;

public class StringCharacterExtractionDemo {

	public static void main(String[] args) {

		//using charAt 

		String collegeName = "Texas International College";
		char chatAtIndex2 = collegeName.charAt(2);
		System.out.println("Char : " + chatAtIndex2);

		
		for (int i = 0; i < collegeName.length(); i++) {
			char data = collegeName.charAt(i);
			System.out.println("Data : " + data);
		}

		//using toCharArray

		String address = "Old Baneshowr 1";
		char[] resultAddress = address.toCharArray();
		for (int i = 0; i < resultAddress.length; i++) {
			System.out.println(resultAddress[i]);
		}
		
		
	}
}
