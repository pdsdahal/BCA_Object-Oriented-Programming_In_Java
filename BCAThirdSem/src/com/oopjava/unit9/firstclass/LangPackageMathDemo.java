package com.oopjava.unit9.firstclass;

public class LangPackageMathDemo {

	public static void main(String[] args) {

		// abs
		int data = -100;
		int positiveData = Math.abs(data);
		System.out.println("Input : " + data + " Result Using abs = " + positiveData);

		// round
		double data1 = 10.50;
		long reusltData1 = Math.round(data1);
		System.out.println("Input : " + data1 + " Result using Round = " + reusltData1);

		// ceil (>= input argument)

		double data2 = 10.49;
		double resultData2 = Math.ceil(data2);
		System.out.println("Input : " + data2 + " Result using ceil = " + resultData2);

		// floor  (<= input argument)

		double data3 = 10.49;
		double resultData3 = Math.floor(data3);
		System.out.println("Input : " + data3 + " Result using floor = " + resultData3);

		//max
		System.out.println(" Using max :  "+Math.max(12.56, 12.57));
		
		//min
		System.out.println(" Using min :  "+Math.min(12.56, 12.57));
				
		//random
		System.out.println("Random Data : "+Math.random());
		
		//pow 
		System.out.println("Pow : "+Math.pow(4, 2));
		
		System.out.println("sqrt : "+Math.sqrt(9));
		
		int a = 2;
		int b = 4;
		int result1 = a*a/b + a*b/a;
		int result2 = b*a/b + b*b/a;
		
		System.out.println("Result 1 : "+result1);
		System.out.println("Result 2 : "+result2);
		
	}

}
