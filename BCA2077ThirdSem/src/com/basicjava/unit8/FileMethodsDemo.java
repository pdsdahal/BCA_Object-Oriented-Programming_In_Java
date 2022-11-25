package com.basicjava.unit8;

import java.io.File;

public class FileMethodsDemo {
	public static void main(String[] args) {
		
		String fileName = "Texas.txt";
		
		File file = new File(fileName);
		
		if(file.exists()) {
			
			System.out.println("Size : "+file.length());
			System.out.println("Name : "+file.getName());
			System.out.println("Path : "+file.getAbsolutePath());
			
			if(file.delete()) {
				System.out.println("File Deleted Successfully!");
			}else {
				System.out.println("Failed to Delete!");
			}
			
			
			
		}else {
			System.out.println("Not able to find!");
		}
		
		
	}

}
