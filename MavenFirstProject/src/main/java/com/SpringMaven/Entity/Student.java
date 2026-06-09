package com.SpringMaven.Entity;

public class Student {
	
	private String Name;
	private int Roll_No;
	private float Marks;
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
	public float getMarks() {
		return Marks;
	}
	public void setMarks(float marks) {
		Marks = marks;
	}
	
	public void display() {
		System.out.println("Name:-"+Name);
		System.out.println("Roll_No:-"+Roll_No);
		System.out.println("Marks:-"+Marks);
	}

}
