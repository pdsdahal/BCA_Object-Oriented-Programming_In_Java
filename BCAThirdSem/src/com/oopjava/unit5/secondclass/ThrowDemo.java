package com.oopjava.unit5.secondclass;

public class ThrowDemo {
	
	public void showData(String data) {
		
		if(data.length()>5) {
			System.out.println("Length : "+data.length());
		}else {
			throw new NullPointerException("Length is less than 5.");
		}
	}
	
	
	public static void main(String[] args) {
		
		ThrowDemo demo = new ThrowDemo();
		try {
			demo.showData("Verisk Nepal");
		}catch (NullPointerException e) {
			System.out.println("Reason : "+e.getMessage());
		}
	}

}
