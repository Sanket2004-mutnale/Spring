package com.sp.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sp.Beans.Student;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/sp/Resource/ApplicationContext.xml");
		
		Student std = (Student) context.getBean("std");
		std.display();
		}

}
