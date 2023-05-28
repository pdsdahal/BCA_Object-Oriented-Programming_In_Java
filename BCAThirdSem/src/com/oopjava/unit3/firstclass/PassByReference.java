package com.oopjava.unit3.firstclass;

import java.util.Arrays;

public class PassByReference {
	
	public void getData(int[] ages) {
		ages[0] = 10;
		ages[1] = 20;
	}
	
	public static void main(String[] args) {
		
		int[] ages = {1,34,56,67,7};
		System.out.println("Before calling getData method : "+Arrays.toString(ages));

		PassByReference demo = new PassByReference();
		demo.getData(ages);
		
		System.out.println("After calling get Data : "+Arrays.toString(ages));
		
	}

}
