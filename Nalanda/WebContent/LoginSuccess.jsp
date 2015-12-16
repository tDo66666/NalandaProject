<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login success page</title>
</head>

<body>
<%
String userName = null;
Cookie[] cookies = request.getCookies();
if(cookies != null){
	for(Cookie cookie : cookies){
		if(cookie.getName().equals("dharma_name"))
			userName = cookie.getValue();
	}
}
if(userName == null) response.sendRedirect("homepage.jsp");
%>
	<h3>Amidaphat, <%= userName %>! Login Successful.</h3>
	<form action="LogoutServlet" method="post">
		<input class="btn btn-primary btn-lg" type="submit" value="Logout">
	</form>
	<a href="homepage.jsp">Home page</a>
</body>
</html>