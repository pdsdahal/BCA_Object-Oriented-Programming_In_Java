package com.basicjava.unit5;

public class TryCatchDemo {

	public static void main(String[] args) {

		String data = null;

		try {
			int size = data.length();
			System.out.println("Size is : " + size);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
