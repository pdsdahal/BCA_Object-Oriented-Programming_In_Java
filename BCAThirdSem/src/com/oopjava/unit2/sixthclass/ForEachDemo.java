package com.oopjava.unit2.sixthclass;

import java.util.Arrays;

public class ForEachDemo {

	public static void main(String[] args) {

		int[] rollNos = { 1, 2, 3, 4, 5, 8, 9, 100 };
		String[] names = { "Apple", "Ball", "Cat" };
		double[] salary = { 345.67, 567, 6789.890 };
		char[] chars = { 'a', 'b', 'c' };

		int[] evenArray = new int[4];
		int[] oddArray = new int[4];

		int ieven = 0;
		int iodd = 0;

		for (int rollno : rollNos) {

			if (rollno % 2 == 0) {
				evenArray[ieven] = rollno;
				ieven++;
			} else {
				oddArray[iodd] = rollno;
				iodd++;
			}
		}

		System.out.println("Even : " + Arrays.toString(evenArray));
		System.out.println("Odd : " + Arrays.toString(oddArray));

	}

}
