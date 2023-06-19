package com.oopjava.unit8.firtclass;

import java.io.File;
import java.io.FileOutputStream;

public class WriteFileUsingByteStream {

	public static void main(String[] args) throws Exception {
		
		File file = new File("Sample.txt");
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		
		String collegeDetails = "Today is Wednesday!!!!";
		byte[] collegeDataInByte = collegeDetails.getBytes();
		fileOutputStream.write(collegeDataInByte);
		
		System.out.println("Write successfully!");
		
		fileOutputStream.close();
	}
}
