package com.oopjava.unit3.secondclass;

public class EncapsulationDemo {

	private int employeeId;
	private String employeeName;
	private double salary;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public static void main(String[] args) {

		EncapsulationDemo demo = new EncapsulationDemo();
		demo.setEmployeeId(100);
		demo.setEmployeeName("Shyam Panday");
		demo.setSalary(23456.56);
		
		System.out.println("EmployeeID : " + demo.getEmployeeId());
		System.out.println("Name : " + demo.getEmployeeName());
		System.out.println("Salary : " + demo.getSalary());
	}

}
