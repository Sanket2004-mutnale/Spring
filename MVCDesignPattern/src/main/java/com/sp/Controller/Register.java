package com.sp.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import com.sp.DBCnnection.JDBCconnection;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/regForm")
public class Register extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		
		String myname = req.getParameter("Name");
		String myEmail = req.getParameter("Email");
		String myPassword = req.getParameter("PassWord");
		
		
		try {
			Connection con = JDBCconnection.getConnection();
			
			if (con == null) {
	            out.println("<h3 style='color:red'>Database connection failed</h3>");
	            RequestDispatcher rd = req.getRequestDispatcher("/Register2.html");
	            rd.include(req, resp);
	            return;
	        }
			String Sql_query = "Insert into Resgiter values(?,?,?)";
			PreparedStatement ps = con.prepareStatement(Sql_query);
			ps.setString(1, myname);
			ps.setString(2, myEmail);
			ps.setString(3, myPassword);
			
			int count = ps.executeUpdate();
			
			if(count>0) {
				out.println("<h3 style='color:green'>Register Successful</h3>");
				
				RequestDispatcher rd = req.getRequestDispatcher("/Login.html");
				rd.include(req, resp);
			}
			else {
				out.println("<h3 style='color:red'>User not register due to some error</h3>");
				
				RequestDispatcher rd = req.getRequestDispatcher("/Register2.html");
				rd.include(req, resp);
			
				out.println("failed");
			}
			}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	

}
