package com.oopjava.unit10.thirdclass.collection;

import java.util.LinkedList;

public class EmployeeLinkedListDemo {
	
	public static void main(String[] args) {
		
		LinkedList<Employee> linkedList = new LinkedList<Employee>();
		
		Employee employee1 = new Employee();
		employee1.setEmpAddress("Kathmandu 1");
		employee1.setEmpName("Ram Panday");
		employee1.setEmpId(123);
		
		Employee employee2 = new Employee();
		employee2.setEmpAddress("Kathmandu 2");
		employee2.setEmpName("Ram Shrestha");
		employee2.setEmpId(234);
		
		//add data 
		linkedList.add(employee1);
		linkedList.add(employee2);
		
		Employee employeeAtIndexOne = linkedList.get(1);
		System.out.println("Name : "+employeeAtIndexOne.getEmpName());
		System.out.println("Address : "+employeeAtIndexOne.getEmpAddress());
		System.out.println("Id : "+employeeAtIndexOne.getEmpId());
		
	}

}
