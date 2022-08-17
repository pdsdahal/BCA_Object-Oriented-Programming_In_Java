package com.basicjava.class4;

public class NonPrimitiveInterfaceDemoUse implements NonPrimitiveInterfaceDemo {

	public void add(int num1, int num2) {

		int result = num1+num2;
		System.out.println("the sum of "+num1+" , "+num2+ " = "+result);
	}

	public String displayData() {
		String collegeName = "Texas international college";
		return collegeName;
	}
	
	public static void main(String[] args) {
		
		NonPrimitiveInterfaceDemoUse demo1 = new NonPrimitiveInterfaceDemoUse();
		demo1.add(20, 30);
		String result = demo1.displayData();
		System.out.println(result);
	}
}
