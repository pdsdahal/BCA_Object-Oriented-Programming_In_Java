package com.oopjava.unit3.firstclass;

public class PassByValueDemo {

	public int getAge(int age) {
		
		int sum = age + 10;
		return sum;
	}
	
	
	public String getPersonInfo(String name, double salary, char gender) {
		
		String result = "Name : "+name + "\nSalaray : "+salary+"\nGender : "+gender;
		return result;
	}
	
	public static void main(String[] args) {
		
		int age = 5;
		PassByValueDemo demo = new PassByValueDemo();
		age = demo.getAge(age);
		System.out.println("Age : "+age);
		
		String result = demo.getPersonInfo("Ram Panday", 123.345, 'M');
		System.out.println(result);
	}
}
