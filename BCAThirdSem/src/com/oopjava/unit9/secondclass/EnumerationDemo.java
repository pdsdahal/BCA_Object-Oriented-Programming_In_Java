package com.oopjava.unit9.secondclass;

public class EnumerationDemo {
	
	public static void main(String[] args) {
		
		enum Employee{
			FirstName,
			LastName,
			Address,
			Age
		}
				
		System.out.println(Employee.Address);
		System.out.println(Employee.Age);
		System.out.println(Employee.FirstName);
		
		Employee emp = Employee.Address;
		
		switch(emp) {
			
		case Address:
			System.out.println("Address : Kathmandu Nepal.");
			break;
			
		case LastName:
			break;
		
		}
		
		
	}
}
