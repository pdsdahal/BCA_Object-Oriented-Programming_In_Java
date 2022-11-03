package com.basicjava.unit5;

public class TryFinallyDemo {

	public static void main(String[] args) {
		int age = 12;
		try {
			int result = age / 0;
			System.out.println(result);

		} finally

		{
			age = 13;
			System.out.println("Age is : " + age);
		}
	}
}
