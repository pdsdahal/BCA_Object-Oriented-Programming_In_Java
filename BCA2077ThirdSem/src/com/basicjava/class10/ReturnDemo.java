package com.basicjava.class10;

public class ReturnDemo {
	
	public static void main(String[] args) {
		int num1 = 20;
		int num2 = 10;
		ReturnDemo demo = new ReturnDemo();
		demo.noReturnNoArgumentDemo();
		demo.noReturnYesArgumentDemo(num1, num2);
		
		int result = demo.yesReturnNoArgumentDemo();
		System.out.println("Result of Division : "+result);
		
		int result1 = demo.yesReturnYesArgumentDemo(num1, num2);
		System.out.println("Division of "+num1 + " , "+num2 + " = "+result1);
	}
	
	public void noReturnNoArgumentDemo() {
		int num1 = 30;
		int num2 = 50;
		int mul  = num1*num2;
		System.out.println("Multiplication of "+num1 + " , "+num2 + " = "+mul);
	}

	public void noReturnYesArgumentDemo(int num1, int num2) {
	
		int sum = num1+num2;
		System.out.println("Addition of "+num1 + " , "+num2 + " = "+sum);
	}
	
	
	public int yesReturnNoArgumentDemo() {
		
		int num1 = 12;
		int num2 = 6;
		
		System.out.println("Divinsion of : "+num1 + " , "+num2);
		int div = num1/num2;
		return div;
	}
	
	public int yesReturnYesArgumentDemo(int num1, int num2) {
		return num1/num2;
	}
	
	
	
}
