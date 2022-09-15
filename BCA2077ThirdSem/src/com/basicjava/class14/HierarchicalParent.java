package com.basicjava.class14;

public class HierarchicalParent {

	protected String phoneNo;
	protected String address;

	public HierarchicalParent(String phoneNo, String address) {
		this.phoneNo = phoneNo;
		this.address = address;
	}

	public void showData() {
		System.out.println("PhoneNo : " + phoneNo);
		System.out.println("Address : " + address);
	}

}
