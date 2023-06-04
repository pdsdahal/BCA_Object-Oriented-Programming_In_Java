package com.oopjava.unit5.firstclass;

public class ExceptionHandlingClassWork1 {

	public static void main(String[] args) {

		String[] names = { "Ram", "Hari", "Gopal", "Ball", "Cat" };

		try {
			String valueAtFifthIndex = names[5];
			System.out.println("At index 5: " + valueAtFifthIndex);
		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("Reason : "+e.getMessage());
		}

		// display all elements

		for (String name : names) {
			System.out.println(name);
		}
	}

}
