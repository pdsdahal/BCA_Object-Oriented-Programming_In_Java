package com.basicjava.unit10;

import java.util.ArrayList;

 class Employee{
	private String firstName;
	private String lastName;
	private int age;
	private double income;
	
	Employee(String firstName, String lastName, int age, double income){
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.income = income;
	}
	
	public String toString(){
		return "Name : "+firstName +" "+ lastName + " Age : "+age + " Income : "+income;
	}
}

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		ArrayList<String> nameList = new ArrayList<>();
		nameList.add("Ram Panday");
		nameList.add("Ram Panday");
		nameList.add("Shyam Shrestha");
		
		System.out.println("Initial : "+nameList);
		
		System.out.println("size  : "+nameList.size());
		
		nameList.remove(0);
		
		System.out.println("Final : "+nameList);
		
		
		//Creating ArrayList as an Object type
	
		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		
		employeeList.add(new Employee("Ram", "Dahal", 23, 5678.6));
		employeeList.add(new Employee("Shyam", "Dahal", 13, 78.6));
		//
		
		for(Employee emp : employeeList) {
			System.out.println(emp);
		}
		
	}
}
