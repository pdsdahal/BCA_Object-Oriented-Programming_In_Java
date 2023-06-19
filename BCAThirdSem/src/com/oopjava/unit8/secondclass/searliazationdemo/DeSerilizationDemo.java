package com.oopjava.unit8.secondclass.searliazationdemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeSerilizationDemo {

	public static void main(String[] args) {

		try {

			FileInputStream fIS = new FileInputStream("SeriDemo.txt");
			ObjectInputStream oIS = new ObjectInputStream(fIS);

			Student student = (Student) oIS.readObject();
			System.out.println("Age : " + student.getAge());
			System.out.println("Name : " + student.getName());
			System.out.println("RollNo : " + student.getRollNo());
			
			oIS.close();
			fIS.close();

		} catch (Exception e) {

		}

	}

}
