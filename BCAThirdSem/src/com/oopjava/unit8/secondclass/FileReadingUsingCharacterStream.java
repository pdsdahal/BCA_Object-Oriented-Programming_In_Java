package com.oopjava.unit8.secondclass;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReadingUsingCharacterStream {

	public static void main(String[] args) {

		try {
			File file = new File("CharcterStream.txt");
			FileReader fileReader = new FileReader(file);
			int data;
			while((data = fileReader.read()) != -1) {
				char result = (char) data;
				System.out.print(result);
			}
			
			fileReader.close();
			
		} catch (Exception e) {
			System.out.println("Exception : "+e.getMessage());

		}
	}

}
