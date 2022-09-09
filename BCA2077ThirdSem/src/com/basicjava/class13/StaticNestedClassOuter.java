package com.basicjava.class13;

public class StaticNestedClassOuter {

	static private String collegeName = "Texas International College";

	static class InnerClass {
		public void showCollegeName() {
			System.out.println("College Name : " + collegeName);
		}
	}

	public static void main(String[] args) {
		InnerClass childClass = new StaticNestedClassOuter.InnerClass();
		childClass.showCollegeName();
	}
}