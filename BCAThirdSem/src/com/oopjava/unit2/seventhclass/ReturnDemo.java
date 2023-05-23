package com.oopjava.unit2.seventhclass;

public class ReturnDemo {
	
	public void findSum(int num1, int num2) {
		int sum = num1+num2;
		System.out.println("Sum of "+num1 + " + "+num2 + " = "+sum);
	}
	
	public int findMul(int num1, int num2) {
		int mul = num1*num2;
		return mul;
	}
	
	public String getName() {
		return "Ram Panday";
	}

	public static void main(String[] args) {
		
		ReturnDemo demo = new ReturnDemo();
		int mul = demo.findMul(10, 2);
		System.out.println("Muliplication is : 10 * 2 = "+mul);
		
		demo.findSum(200, 100);
		
		String name = demo.getName();
		System.out.println("Name : "+name);
		
	}
}
