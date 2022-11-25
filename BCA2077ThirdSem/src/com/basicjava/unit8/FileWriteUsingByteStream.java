package com.basicjava.unit8;

import java.io.FileOutputStream;

public class FileWriteUsingByteStream {

	public static void main(String[] args) throws Exception {
		
		String sourceFilePath = "F:\\GitShankar\\BCA_Object-Oriented-Programming_In_Java\\BCA2077ThirdSem\\resources\\CollegeInfo1.txt";
		FileOutputStream fileOutputStream = new FileOutputStream(sourceFilePath);
		
		String personalInfo = "Name : Ram Panday\nRollNo : 12\nCollegeName : Texas";
		
		byte[] byteInfo = personalInfo.getBytes();
		
		fileOutputStream.write(byteInfo);
		fileOutputStream.close();
		
		System.out.println("Success!");
	}
}
