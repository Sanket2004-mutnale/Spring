package com.sp.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.sp.DBCnnection.JDBCconnection;
import com.sp.users.User;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/logForm")
public class Login extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		
		
		String myEmail = req.getParameter("email");
		String myPassword = req.getParameter("password");
		
		
		try {
			Connection con = JDBCconnection.getConnection();
			
			if (con == null) {
	            out.println("<h3 style='color:red'>Database connection failed</h3>");
	            RequestDispatcher rd = req.getRequestDispatcher("/Register2.html");
	            rd.include(req, resp);
	            return;
	        }
			String Sql_query1 = "select * from Resgiter where email=? and password=?";
			PreparedStatement ps = con.prepareStatement(Sql_query1);
			
			ps.setString(1, myEmail);
			ps.setString(2, myPassword);
			
			ResultSet re = ps.executeQuery();
			
			if(re.next()) {
				out.println("<h3 style='color:green'>Login Successful</h3>");
				
				User us = new User();
				us.setEmail(re.getString("name"));
				us.setPassword(re.getString("password"));
				 
				HttpSession session = req.getSession();
				session.setAttribute("session_user", us);
				
				RequestDispatcher rd = req.getRequestDispatcher("/Profile.jsp");
				rd.forward(req, resp);
			}
			else {
				out.println("<h3 style='color:red'>password not match</h3>");
				
				RequestDispatcher rd = req.getRequestDispatcher("/Login.html");
				rd.include(req, resp);
			
				out.println("failed");
			}
			}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
