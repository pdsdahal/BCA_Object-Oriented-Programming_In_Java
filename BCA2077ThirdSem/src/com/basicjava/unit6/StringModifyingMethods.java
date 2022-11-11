package com.basicjava.unit6;

public class StringModifyingMethods {

	public static void main(String[] args) {
		
		//concat
		String studentName = new String("Name : Hari Prasad Panday");
		studentName =  studentName.concat("\nAddress : Baneshwor\n");
		System.out.println(studentName);
		
		//replace character
		String result =  studentName.replace('a', 'b');
		System.out.println(result+"\n");
		
		//replaceAll String
		String result1 = studentName.replaceAll("Name", " ");
		System.out.println(result1);
		
		//trim 
		
		String result2 = result1.trim();
		System.out.println("After trim"+result2);
		
		
		String result3 = studentName.substring(3);
		System.out.println("\nSubString result : "+result3);
		
		String result4 = studentName.substring(3, 11);
		System.out.println("\nSubstrig from 3 to 11 :"+result4);
		
		
	}
}
