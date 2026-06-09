<%@page import="com.sp.users.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <% User us= (User)session.getAttribute("session_user");
   %>
<h1>Welcome</h1>
  <h3> Email: <%= us.getEmail() %></h3>
  <h3> password: <%= us.getPassword() %></h3>
  
  <a href="LogOut" >Logout </a>
  </body>
</html>