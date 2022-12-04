package com.basicjava.unit8;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReadConsoleInputDemo {

	public static void main(String[] args) throws Exception{

		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		System.out.println("Enter a number");
		int num1 = Integer.valueOf(bufferedReader.readLine());
		
		//read string data
		//String variableName = bufferedReader.readLine();
		
		
		System.out.println("Enetered college name : "+num1);

	}
}
