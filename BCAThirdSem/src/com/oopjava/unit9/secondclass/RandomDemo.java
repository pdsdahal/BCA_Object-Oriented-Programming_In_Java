package com.oopjava.unit9.secondclass;

import java.util.Random;

public class RandomDemo {
	
	public static void main(String[] args) {
		
		//0-<100
		Random random = new Random();
		int data = random.nextInt(100);
		
		System.out.println("Data Random Int : "+data);
	
		
		double data1 =  random.nextDouble(100);
		System.out.println("Data Double Random : "+data1);
		
	}

}
