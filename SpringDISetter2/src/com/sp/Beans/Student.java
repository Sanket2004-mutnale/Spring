package com.sp.Beans;

public class Student {
	
	private String Name;
	private int Roll_No;
	private Address address;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getRoll_No() {
		return Roll_No;
	}
	public void setRoll_No(int roll_No) {
		Roll_No = roll_No;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void display() {
		System.out.println("Roll_NO:"+Roll_No);
		System.out.println("Name:-"+Name);
		System.out.println("Address:-"+address);
	}
	

}
