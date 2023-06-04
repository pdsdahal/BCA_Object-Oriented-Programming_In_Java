package com.oopjava.unit5.firstclass;

public class NestedTyeCatchDemo {
	
	public static void main(String[] args) {
		
		int data = 13;
		
		try {
			
			int data2 = 0;
			String name = null;
			int length = name.length();
			
			System.out.println("Initial Number : "+data);
			try {
				
				data = data + 13;
				int result = data/data2;
				System.out.println("Result : "+result);
				
			}catch(Exception e2) {
				System.out.println( "EXception from inside "+e2.getMessage());
			}
			
		}catch(Exception e) {
			
			System.out.println( "EXception from outside "+e.getMessage());
			try {
				
			}catch(Exception e1) {
				
			}
			
		}
		
	}

}
