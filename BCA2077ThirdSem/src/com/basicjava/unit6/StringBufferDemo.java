package com.basicjava.unit6;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer college = new StringBuffer();
		college.append("Texas ").append("International ").append("College");
		
		String collegeName = college.toString();
		System.out.println("College Name : "+collegeName);
	}
}