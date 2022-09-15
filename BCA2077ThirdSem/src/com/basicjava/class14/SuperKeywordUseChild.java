package com.basicjava.class14;

public class SuperKeywordUseChild extends SuperKeywordUseParent{

	public SuperKeywordUseChild(String collegeName) {
		super(collegeName);
	}

	private String collegeAddress;
	
	public void setCollegeAddress(String collegeAddress) {
		this.collegeAddress = collegeAddress;
	}
	
	public void displayCollegeInfo() {
		String collegeName = super.collegeName;
		System.out.println("From Instance College Name : "+collegeName);
		
		System.out.println("College Name form method : ");
		super.showCollegeName();
		System.out.println("College Address : "+collegeAddress);
	}
	
	
	public static void main(String[] args) {
		SuperKeywordUseChild demo = new  SuperKeywordUseChild("ABC International College");
		demo.setCollegeName("Texas International College");
		demo.setCollegeAddress("Baneshwor 1");
		demo.displayCollegeInfo();
	}
	
}
