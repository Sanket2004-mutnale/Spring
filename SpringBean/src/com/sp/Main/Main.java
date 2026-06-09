package com.sp.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sp.bean.Student;
import com.sp.resource.SpringConfigfile;

public class Main {
    public static void main(String[] args) {
      //ApplicationContext context = new ClassPathXmlApplicationContext("com/sp/resource/ApplicationContext.xml");
    	ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigfile.class);
        Student std = (Student) context.getBean("student");
        std.display();
    }
}
