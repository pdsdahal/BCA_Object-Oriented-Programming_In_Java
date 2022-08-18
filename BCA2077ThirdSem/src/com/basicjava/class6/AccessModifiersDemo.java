package com.basicjava.class6;

public class AccessModifiersDemo {

	//default variable
	int num1; 
	
	//private instance variable 
	private int num2;
	
	//public instance variable
	public String data3;
	
	//protected instance variable
	protected double income;
	
	
	//default method
	void showData() {
		System.out.println(" Value of num1 is : "+num1);
	}
	
	//private method
	private void displayData() {
		System.out.println("Value of num2 is : "+num2);
	}
	
	//public method
	public void printData() {
		System.out.println("Value of data3 is : "+data3);
	}
	
	public static void main(String[] args) {
		//only display private method and variable
		
		AccessModifiersDemo accDemo = new AccessModifiersDemo();
		accDemo.num2  = 200;
		accDemo.displayData();
	}
	
}
