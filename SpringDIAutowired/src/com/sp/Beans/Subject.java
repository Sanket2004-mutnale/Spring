package com.sp.Beans;

import java.util.List;

public class Subject {
	
	private List<String>subject;

	public void setSubject(List<String> subject) {
		this.subject = subject;
	}

	public List<String> getSubject() {
		return subject;
	}

	@Override
	public String toString() {
		return subject.toString();
	}
	
	

}
