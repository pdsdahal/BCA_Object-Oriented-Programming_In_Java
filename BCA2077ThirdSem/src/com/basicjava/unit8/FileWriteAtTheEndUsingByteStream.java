package com.basicjava.unit8;

import java.io.FileOutputStream;

public class FileWriteAtTheEndUsingByteStream {

	public static void main(String[] args) throws Exception {

		String sourceFilePath = "F:\\GitShankar\\BCA_Object-Oriented-Programming_In_Java\\BCA2077ThirdSem\\resources\\CollegeInfo1.txt";
		FileOutputStream fileOutputStream = new FileOutputStream(sourceFilePath, true);

		String personalInfo = "\nPhoneNo : 23456789";

		byte[] byteInfo = personalInfo.getBytes();

		fileOutputStream.write(byteInfo);
		fileOutputStream.close();

		System.out.println("Success!");
	}
}
