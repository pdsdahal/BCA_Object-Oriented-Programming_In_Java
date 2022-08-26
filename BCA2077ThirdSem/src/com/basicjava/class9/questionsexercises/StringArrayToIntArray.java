package com.basicjava.class9.questionsexercises;

import java.util.Arrays;

public class StringArrayToIntArray {

	public static void main(String[] args) {
		String[] datas = { "Apple", "Cat", "Dog" };
		int[] intArray = new int[datas.length];
		for (int i = 0; i < datas.length; i++) {
			String data = datas[i];
			int dataLength = data.length();
			intArray[i] = dataLength;
		}
		System.out.println("String Array : " + Arrays.toString(datas));
		System.out.println("Integer Array : " + Arrays.toString(intArray));
	}
}