package com.sp.DBCnnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCconnection {
	
	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(
			    "jdbc:mysql://localhost:3306/MVC_project", "root", "sanket123");
		} catch (Exception e) {
			e.printStackTrace(); // This is important for debugging
		}
		return con;
	}
}
