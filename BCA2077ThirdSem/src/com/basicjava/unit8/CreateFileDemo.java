package com.basicjava.unit8;

import java.io.File;

public class CreateFileDemo {

	public static void main(String[] args) throws Exception {
		
		File file = new File("Texas.txt");
		if(file.createNewFile()) {
			System.out.println("File Created Successfully!");
		}else {
			System.out.println("Failed to create File!");
		}
		
		
		
	}
}
