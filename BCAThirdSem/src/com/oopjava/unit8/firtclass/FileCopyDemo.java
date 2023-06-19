package com.oopjava.unit8.firtclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyDemo {

	public static void main(String[] args) throws IOException {

		String sourceFileName = "Sample.txt";
		String targetFileName = "target.txt";

		File fileSource = new File(sourceFileName);
		File fileTarget = new File(targetFileName);

		FileOutputStream fileOutputStream = new FileOutputStream(fileTarget);
		FileInputStream fileInputStream = new FileInputStream(fileSource);

		int data;
		while ((data = fileInputStream.read()) != -1) {
			fileOutputStream.write(data);
		}
		fileInputStream.close();
		fileOutputStream.close();
		
		System.out.println("File Copied successfully!");

	}

}
