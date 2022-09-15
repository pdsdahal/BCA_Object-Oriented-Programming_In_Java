package com.basicjava.class14;

public class SuperKeywordUseParent {

	protected String collegeName;
	
	public SuperKeywordUseParent(String collegeName) {
		System.out.println("College Name form constructor : "+collegeName);
	}
	
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	
	public void showCollegeName() {
		System.out.println("College Name : "+collegeName);
	}
}
