package com.oopjava.unit4.secondclass;

import com.oopjava.unit4.thirdclass.BuiltInPackageDemo;

public class UserDefinedPackageDemo extends BuiltInPackageDemo {

	
	public void inputImpl() {
		super.getInputFromUser();
	}
	
	public static void main(String[] args) {
		
		UserDefinedPackageDemo obj = new UserDefinedPackageDemo();
		obj.inputImpl();
	}
}
