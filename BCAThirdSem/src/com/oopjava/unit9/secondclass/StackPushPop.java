package com.oopjava.unit9.secondclass;

import java.util.Stack;

public class StackPushPop {

	public static void main(String[] args) {
		
		Stack<Integer> rollNo = new Stack<Integer>();
		rollNo.push(10);
		rollNo.push(20);
		rollNo.push(30);
		rollNo.push(40);
		rollNo.push(50);
		
		System.out.println("Initial Size : "+rollNo.size());
		
		Integer topElement =  rollNo.pop();
		System.out.println("Top Element is : "+topElement);
		
		Integer topSecondElement =  rollNo.pop();
		System.out.println("Top from second place Element is : "+topSecondElement);
		
		System.out.println("Final Size after remove : "+rollNo.size());
		
	}
}
