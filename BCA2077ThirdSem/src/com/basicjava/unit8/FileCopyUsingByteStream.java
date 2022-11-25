package com.basicjava.unit8;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyUsingByteStream {

	public static void main(String[] args) throws Exception {
		
		String sourceFilePath = "F:\\GitShankar\\BCA_Object-Oriented-Programming_In_Java\\BCA2077ThirdSem\\resources\\CollegeInfo1.txt";
		String targetFilePath = "F:\\GitShankar\\BCA_Object-Oriented-Programming_In_Java\\BCA2077ThirdSem\\resources\\CollegeInfo2.txt";
		
		FileInputStream fileInputStream = new FileInputStream(sourceFilePath);
		FileOutputStream fileOutputStream = new FileOutputStream(targetFilePath);
		
		int data; 
		while((data = fileInputStream.read())!=-1) {
			fileOutputStream.write(data);
		}
		
		fileInputStream.close();
		fileOutputStream.close();
		
		System.out.println("Copied.....");
		
		
	}
}
