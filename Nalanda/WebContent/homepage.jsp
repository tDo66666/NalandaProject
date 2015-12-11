<%@page import= "java.util.Date" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- Author: tDo -->
<html>
<head>
<!-- meta http-equiv="Content-Type" content="text/html; charset=UTF-8" -->
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
  
<title>Nalanda Homepage</title>

<style>
	html{
		background: url(files.jpg) no-repeat center center fixed; 
			-webkit-background-size: cover;
			-moz-background-size: cover;
			-o-background-size: cover;
			background-size: cover;
	}
	body{
		background: transparent;
	}
	h1 {
		color: orange;
		text-align: center;
	}
	h4{
		color: blue ;
		text-align: center;
	}
	h6{
		color: red;
		font-size: 22px;
		text-align: center;
	}
	p{
		font-family: "Times New Roman";
    	font-size: 20px;
    	color: yellow;
    	text-align: center;
	}
	form{
		text-align: center;
		font-family: "Arial";
    	font-size: 21px;
    	color: orange;
	}
	a{
		text-align: center;
	}
	.margin-base-vertical{
		margin: 100px 0;
	}
	
</style>
</head>

<body>
	<div class="container">
		<h1 class="margin-base-vertical">Hội Phật Học Nalanda</h1>
		
		<h4>Nalanda, Buddhism Learning Society </h4>
		<br>
		<p>
			This a website for people to learn about Buddhism.
			<br>
			Nalanda history...
			<br>
			Basic learning. Intermedium learning. Advance learning.
		</p>
	
		<h6>
			Time and Date: <%= new Date() %>
		</h6>
		
		<form action="HomepageServlet" method="post">
			Họ Tên:* 
			<br>
			<input type="text" name="normal_name">
			<br>
			Pháp danh:* 
			<br>
			<input type="text" name="dharma_name">
			<br>
			Mật khẩu: * 
			<br>
			<input type="password" name="pwd">
			<br>
			<input type="submit" value="Login">
		</form>
		
		<a href="LoginSuccess.jsp">Login success page</a>
	</div>
</body>
</html>