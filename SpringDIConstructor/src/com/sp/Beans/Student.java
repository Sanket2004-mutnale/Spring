package com.sp.Beans;

public class Student {
	
	private String Name;
	private int Roll_No;
	private Address address;
	
	public Student(String Name,int Roll_No,Address address) {
		this.Name=Name;
		this.Roll_No=Roll_No;
		this.address=address;
	}
	public void display() {
		System.out.println("Roll_NO:"+Roll_No);
		System.out.println("Name:-"+Name);
		System.out.println("Address:-"+address);
	}
	

}
