package com.basicjava.class2;

public class NonPrimitiveDataTypeClassDemoUse {

	public static void main(String[] args) {
		
		NonPrimitiveDataTypeClassDemo nonprimdemo = new NonPrimitiveDataTypeClassDemo(1, "Ram Panday", "Kathmandu 32", true, 1223456l, 56.67);
		nonprimdemo.getStudentInfo();
		
		String studentName = nonprimdemo.getStudentName();
		System.out.println("Student Name from Second method : "+studentName);
	}
}
