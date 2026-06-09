package com.sp.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sp.Beans.Student;
import com.sp.Resource.SpringConfig;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		Student std = (Student) context.getBean(Student.class);
		std.display();
		}

}
