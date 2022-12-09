package com.basicjava.unit9;

import java.util.Stack;

public class StackDemo {
	
	public static void main(String[] args) {
		
		Stack<String> stackStudent = new Stack<String>();
		stackStudent.push("Ram");
		stackStudent.push("Shyam");
		stackStudent.push("Hari");
		
		System.out.println("Orginal Stack : "+stackStudent);
		
		String topElementPop = stackStudent.pop();
		System.out.println("Removed : "+topElementPop);
		System.out.println("From Top of the stack : "+stackStudent.peek());
		System.out.println("After basic operation : "+stackStudent);
		
		int indexOfShyam = stackStudent.search("Ram");
		System.out.println("Index : "+indexOfShyam);
		
	}

}
