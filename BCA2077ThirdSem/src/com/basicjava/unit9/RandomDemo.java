package com.basicjava.unit9;

import java.util.Random;

public class RandomDemo {
	
	public static void main(String[] args) {
		
		Random random = new Random();
		double doubleValue =  random.nextDouble();
		System.out.println(doubleValue);
		System.out.println(random.nextInt());
		System.out.println(random.nextBoolean());
		
		int value = random.nextInt(5, 50);
		System.out.println("Random value between 5 and 50 : "+value);
	}

}
