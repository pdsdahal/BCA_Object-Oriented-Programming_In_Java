package com.basicjava.unit8;

import java.io.FileReader;

public class FileReadUsingCharacterStream {

	public static void main(String[] args) throws Exception {

		String sourceFilePath = "F:\\GitShankar\\BCA_Object-Oriented-Programming_In_Java\\BCA2077ThirdSem\\resources\\CollegeInfo1.txt";

		FileReader fileReader = new FileReader(sourceFilePath);
		int data;
		while ((data = fileReader.read()) != -1) {
			
			char result = (char)data;
			System.out.print(result);
		}
		fileReader.close();
	}
}
