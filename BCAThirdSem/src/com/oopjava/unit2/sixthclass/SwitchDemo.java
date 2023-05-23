package com.oopjava.unit2.sixthclass;

public class SwitchDemo {

	public static void main(String[] args) {

		
		int num1 = 2;
		
		switch (num1) {

		case 1:// num1==1
			System.out.println("Case 1 : "+num1);
			break;

		case 2://num1==2
			System.out.println("Case 2 : "+num1);
			break;

		default:
			System.out.println("No case match : "+num1);

		}

	}

}
