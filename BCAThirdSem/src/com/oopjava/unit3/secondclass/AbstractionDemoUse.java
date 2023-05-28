package com.oopjava.unit3.secondclass;

public class AbstractionDemoUse extends AbstractionDemo {

	public void setEmployeeDetails(String name, String address) {
		
		System.out.println("Name : "+name);
		System.out.println("Address: "+address);
	}

	public int getSum(int num1, int num2) {
		return num1+num2;
	}

	public void getSalary() {
		System.out.println("Salary : 2345678");
	}

	public static void main(String[] args) {
		
		AbstractionDemoUse child = new AbstractionDemoUse();
		child.setEmployeeDetails("Ram Panday", "Kathamndu Nepal");
		child.getSalary();
		child.getSum(10, 20);
	}
}
