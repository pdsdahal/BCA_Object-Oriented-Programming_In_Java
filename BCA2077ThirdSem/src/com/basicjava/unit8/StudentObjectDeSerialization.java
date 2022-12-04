package com.basicjava.unit8;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class StudentObjectDeSerialization {

	public static void main(String[] args) throws Exception {
	
		
		FileInputStream fileInputStream = new FileInputStream("seri.txt");
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		StudentObject obj1 =  (StudentObject) objectInputStream.readObject();
		
		int age = obj1.getAge();
		String name = obj1.getName();
		int rollNo = obj1.getRollNo();
		
		System.out.println("Age : "+age);
		System.out.println("Name : "+name);
		System.out.println("RollNo : "+rollNo);
		
		objectInputStream.close();
		fileInputStream.close();
	}
}
