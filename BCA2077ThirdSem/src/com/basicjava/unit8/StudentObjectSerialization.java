package com.basicjava.unit8;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class StudentObjectSerialization {

	public static void main(String[] args) throws Exception {
	
		StudentObject obj1 = new StudentObject();
		obj1.setAge(12);
		obj1.setName("Ram Panday");
		obj1.setRollNo(1);
		
		FileOutputStream fileOutputStream = new FileOutputStream("seri.txt");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(obj1);
		
		fileOutputStream.close();
		objectOutputStream.close();
		System.out.println("Success!!");
	
	}
}
