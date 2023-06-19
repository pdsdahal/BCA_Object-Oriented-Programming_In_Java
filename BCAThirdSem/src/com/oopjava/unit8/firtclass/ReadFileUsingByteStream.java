package com.oopjava.unit8.firtclass;

import java.io.File;
import java.io.FileInputStream;

public class ReadFileUsingByteStream {

	public static void main(String[] args) throws Exception {
		
		File file = new File("Student.txt");
		FileInputStream fileInputStream = new FileInputStream(file);
		
		int data;
		while((data = fileInputStream.read()) != -1) {
			char result = (char) data;
			System.out.print(result);
		}
		
		fileInputStream.close();
		
	}
}
