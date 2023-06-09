package com.oopjava.unit6.firstclass;

public class StringBufferAndBuilderDemo {
	
	public static void main(String[] args) {
		
		StringBuffer buffer = new StringBuffer();
		buffer.append("Texas");
		buffer.append(" International");
		buffer.append(" College");
		
		System.out.println("Using buffer : "+buffer.toString());
		
		StringBuilder builder = new StringBuilder();
		builder.append("Texas");
		builder.append(" International");
		builder.append(" College");
		
		System.out.println("Using builder : "+builder.toString());
	}

}
