package com.oopjava.unit2.firstclass;

public class VariableTypesDemo {

	//instance variable 
	private int num2 = 0;
	public String name = null;
	
	//static variable
	public static int num3 = 0;
	private static double salary = 3456.5678;
	
	public static void main(String[] args) {
		
		//local variable 
		int num1 = 10;
		double salary = 56;
		
		
		System.out.println("Local Variables\n"+num1 + " , "+salary);
		
		System.out.println("Static Variable\n "+VariableTypesDemo.num3);
		
		System.out.println("Instance Variable\n");
		//step 1 - Create object of class
		
		VariableTypesDemo demo = new VariableTypesDemo();
		System.out.println("Num2 : "+demo.num2);
		
	}
	
}
