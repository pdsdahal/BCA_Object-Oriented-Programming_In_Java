package com.oopjava.unit8.secondclass;

import java.io.File;
import java.io.FileWriter;

public class AddNewContentAtTheEnd {

	public static void main(String[] args) {

		try {
			File file = new File("CharcterStream.txt");
			FileWriter fileWriter = new FileWriter(file, true);
			String message = "\nAddress : Mitrapark";
			fileWriter.write(message);
			fileWriter.close();
			
			System.out.println("File created successfully!");
			
		} catch (Exception e) {
			System.out.println("Exception : "+e.getMessage());

		}
	}

}
