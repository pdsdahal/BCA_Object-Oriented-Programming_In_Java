package com.oopjava.unit8.firtclass;

import java.io.File;

public class CreateFileDemo {

	public static void main(String[] args) throws Exception {

		File file = new File("Sample.txt");

		boolean createFilecheck = file.createNewFile();

		if (createFilecheck) {
			System.out.println("File Created");
		} else {
			System.out.println("Fail to create file!");
		}
	}
}
