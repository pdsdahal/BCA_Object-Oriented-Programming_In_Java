package com.oopjava.unit8.secondclass.searliazationdemo;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerilizationDemo {

	public static void main(String[] args) {

		Student student = new Student();
		student.setName("Ram Panday");
		student.setAge(13);
		student.setRollNo(1);

		try {
			FileOutputStream fOS = new FileOutputStream("SeriDemo.txt");
			ObjectOutputStream oOS = new ObjectOutputStream(fOS);
			oOS.writeObject(student);
			
			System.out.println("Serilization done");
			oOS.close();
			fOS.close();
		} catch (Exception e) {

		}

	}

}
