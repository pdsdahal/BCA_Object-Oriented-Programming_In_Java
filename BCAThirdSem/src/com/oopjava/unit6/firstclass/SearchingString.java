package com.oopjava.unit6.firstclass;

public class SearchingString {

	public static void main(String[] args) {

		//using index of indexOf(single character)
		String collegeName = "Texas College";
		int data = collegeName.indexOf('e');
		System.out.println("From Start : "+data);
		
		//using lastIndex of (single character)
		int lastData = collegeName.lastIndexOf('e');
		System.out.println("From last : "+lastData);
		
		//using index of (single character, start index)
		int indexStartFrom5 = collegeName.indexOf('e', 5);
		System.out.println("Starting from index 5 : "+indexStartFrom5);
		

	}

}
