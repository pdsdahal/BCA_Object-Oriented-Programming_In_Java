package com.oopjava.unit3.fourthclass;

public class StaticNestedClass {
	
	public static class InnerClass{
	
		public int addNum(int num1, int num2) {
			return num1+num2;
		}
	}
	
	public static void main(String[] args) {
		
		InnerClass innerClass =  new StaticNestedClass.InnerClass();
		int result =  innerClass.addNum(10, 12);
		System.out.println("10 + 12 = "+result);
	}

}
