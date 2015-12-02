<%@page import= "java.util.Date" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- Author: tDo -->
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Nalanda Homepage</title>
<style>
	body{
		background-color: white;
	}
	h1 {
		color: orange;
		text-align: center;
	}
	h4{
		color: blue;
		text-align: center;
	}
	h6{
		color: green;
		text-align: right;
	}
	p{
		font-family: "Times New Roman";
    	font-size: 20px;
	}
</style>
</head>

<body>
	<h1>Nalanda</h1>
	<h4>Buddhism: Learn And Practice</h4>
	<p>
		This a website for people to learn about Buddhism.
		<br>
		Nalanda history...
		<br>
		Basic learning. Intermedium learning. Advance learning.
	</p>
	<h6>
		Time and Date: <%  new Date(); %>
	</h6>
</body>
</html>