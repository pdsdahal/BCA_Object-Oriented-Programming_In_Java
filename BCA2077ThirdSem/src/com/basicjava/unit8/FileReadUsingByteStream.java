package com.basicjava.unit8;

import java.io.FileInputStream;

public class FileReadUsingByteStream {

	public static void main(String[] args) throws Exception {

		String sourceFilePath = "F:\\GitShankar\\BCA_Object-Oriented-Programming_In_Java\\BCA2077ThirdSem\\resources\\CollegeInfo.txt";
		FileInputStream fileInputStream = new FileInputStream(sourceFilePath);

		int data;

		while ((data = fileInputStream.read()) != -1) {
			
			char result = (char)data;
			
			System.out.print(result);
		}
		
		fileInputStream.close();
	}
}
