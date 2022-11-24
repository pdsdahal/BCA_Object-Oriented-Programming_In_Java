package com.basicjava.unit6;

public class ToStringDemo {
	
	public String toString() {	
		return "Texas International College";
	}
	
	public static void main(String[] args) {
		
		ToStringDemo demo = new ToStringDemo();
		System.out.println(demo);
		
		String data = "Apple";
		char result = data.charAt(4);
		System.out.println(result);	
	}
}