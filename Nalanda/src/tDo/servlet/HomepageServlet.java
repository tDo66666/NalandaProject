package tDo.servlet;

/* Author: tDo */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HomepageServlet
 */

/* 
 * Annotations
 */
//@WebServlet("/HomepageServlet")
@WebServlet(
			description = "Homepage Servlet",
			urlPatterns = {"/HomepageServlet"},
			initParams = {
					@WebInitParam(name = "user", value = "Giac Duc"),
					@WebInitParam(name = "password", value = "Amidaphat") 
					}
			)

public class HomepageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomepageServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    public void init() throws ServletException{
    	// We can create DB connection resource here and set it to Servlet context
    	if(getServletContext().getInitParameter("dbURL").equals("jdbc:mysql://localhost/mysql_db") &&
    			getServletContext().getInitParameter("dbUser").equals("mysql_user") && 
    			getServletContext().getInitParameter("dbUserPwd").equals("mysql_pwd") ){
    		
    		getServletContext().setAttribute("DB_Success", "True");
    	}
    	else throw new ServletException("DB Connection Error");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		Date date = new Date();
		
		//PrintWriter out = response.getWriter();
		//out.write("homepage.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		// Get request parameters for user ID and password
		String dharma_name = request.getParameter("dharma_name");
		String pwd = request.getParameter("pwd");
		
		// Get servlet config init params
		String userID = getServletConfig().getInitParameter("user");
		String password = getServletConfig().getInitParameter("password");
		
		log("User = "+ dharma_name +" :: password = "+pwd);
		
		if(userID.equals(dharma_name) && password.equals(pwd)){
			// Initialise Cookie and set it to expire in 30 mins
			Cookie loginCookie = new Cookie("dharma_name", dharma_name); // Cookie(String name, String value)
			loginCookie.setMaxAge(30*60);
			
			response.addCookie(loginCookie);
			response.sendRedirect("LoginSuccess.jsp");
		}
		else{
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/homepage.jsp");
			PrintWriter out = response.getWriter();
			out.println("<font color=red>Either user or password is wrong! </font>");
			rd.include(request, response);
		}
	}

}
