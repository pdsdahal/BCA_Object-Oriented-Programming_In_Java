package com.oopjava.unit8.secondclass;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReadConsoleInput {

	public static void main(String[] args) {

		try {
			InputStreamReader inputStreamReader = new InputStreamReader(System.in);
			BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

			System.out.println("enter a number");
			int num = Integer.parseInt(bufferedReader.readLine());
			
			System.out.println("entered number is : "+num);
			
			bufferedReader.close();
			inputStreamReader.close();
			
		} catch (Exception e) {

		}

	}

}
