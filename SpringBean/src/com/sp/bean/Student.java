package com.sp.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("Sanket")
	private String name;
	@Value ("12")
	private int roll_No;
	@Value("94.45f")
	private float marks;
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getRoll_No() {
		return roll_No;
	}



	public void setRoll_No(int roll_No) {
		this.roll_No = roll_No;
	}



	public float getMarks() {
		return marks;
	}



	public void setMarks(float marks) {
		this.marks = marks;
	}



	public void display() {
		System.out.println("Name="+name);
		System.out.println("Roll no="+roll_No);
		System.out.println("Marks="+marks);
	}
}
