package com.basicjava.unit5;

public class BuiltInExceptionCheckedDemo {

	public static void main(String[] args) {

		try {
			Class.forName("texas.college");
		} catch (ClassNotFoundException e) {
			
			System.out.println(e.getMessage());
		}
		
	}
}
