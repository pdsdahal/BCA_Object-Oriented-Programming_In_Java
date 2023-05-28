package com.oopjava.unit3.firstclass;

public class MethodDemo {
	
	public double findAreaCircle(int r) {
		double rd = (double)r;
		double area = (3.14)*(rd)*(rd);
		return area;
	}
	
	public void findAreaRect(int l, int b) {
		
		int area = l*b;
		System.out.println("are of rectangle is : "+area);
	}
	
	public static void main(String[] args) {
		
		MethodDemo demo = new MethodDemo();
		double result = demo.findAreaCircle(5);
		System.out.println("Are of circle is : "+result);
		
		demo.findAreaRect(5, 5);
	}

}
