package com.Main.SpringJDBC;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.Main.Config.SpringConfig;
import com.Main.bean.Student;
import com.Main.mapper.StudentRowMapper;


public class App 
{
    public static void main( String[] args )
    {
    	
    	
       ApplicationContext context =new AnnotationConfigApplicationContext(SpringConfig.class);
       
       JdbcTemplate jdbctem=  context.getBean(JdbcTemplate.class);
     //----------Insertion Method --------------
//       String Name="Sanket";
//   	   int Roll_No=22;
//   	   int Marks = 55;
//       String insert_sql_query = "INSERT INTO Student VALUES (?,?,?)";
//      int count= jdbctem.update(insert_sql_query,Name,Roll_No,Marks);
//      
//      if(count>0) {
//    	  System.out.println("Insertion Successful");
//      }
//      else {
//    	  System.out.println("Failed");
//      }
//       
       //--------- Update table ----------
//       int Marks = 98;
//       int Roll_No =21;
//       String update_sql_query = "update student set marks=? where roll_no=?";
//      int count= jdbctem.update(update_sql_query,Marks,Roll_No);
//      if(count>0) {
//    	  System.out.println("update Successful");
//      }
//      else {
//    	  System.out.println("Failed");
//      }
       
       //------------Delete opration-----------
       
//       int Roll_No=22;
//       String delete_sql_query = "delete from student where roll_no=?";
//       int count= jdbctem.update(delete_sql_query,Roll_No);
//       if(count>0) {
//   	      System.out.println("Delete Successful");
//       }
//       else {
//   	      System.out.println("Failed");
//       }
//       
       
       
       //--------select Query-------
       
       String Select_Sql_Query="Select * from Student";
     List<Student> std_list=  jdbctem.query(Select_Sql_Query, new StudentRowMapper());
       
       for(Student std : std_list) {
    	   System.out.println("Name :"+std.getName());
    	   System.out.println("Roll_No:"+std.getRoll_No());
    	   System.out.println("Marks: "+std.getMarks());
    	   System.out.println("-----------------------------------");
       }
       
    }  
}
