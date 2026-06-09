package com.SpringMaven.MavenFirstProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SpringMaven.Entity.Student;


public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext context = new ClassPathXmlApplicationContext("com/SpringMaven/Confige/ApplicatioContext.xml");
      Student std=  context.getBean(Student.class);
      std.display();
      }
}
