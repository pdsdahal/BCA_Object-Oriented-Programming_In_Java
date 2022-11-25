package com.basicjava.unit8;

import java.io.FileWriter;

public class FileWriteUsingCharacterStream {

	public static void main(String[] args) throws Exception {
		
		String sourceFilePath = "F:\\GitShankar\\BCA_Object-Oriented-Programming_In_Java\\BCA2077ThirdSem\\resources\\EmployeeInfo.txt";
		FileWriter fileWriter  = new FileWriter(sourceFilePath);
		
		String employeeDetails = "Name : Ram Shrestha\nAddress : Baneshwor 1";
		fileWriter.write(employeeDetails);
		fileWriter.close();
		
		System.out.println("Success!");
	}
}
