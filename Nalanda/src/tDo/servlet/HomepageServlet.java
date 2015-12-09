package tDo.servlet;

/* Author: tDo */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HomepageServlet
 */
//@WebServlet("/HomepageServlet")
@WebServlet(
			description = "Homepage Servlet",
			urlPatterns = {"/HomepageServlet"},
			initParams = {
					@WebInitParam(name = "user", value = "ToanDo"),
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
		doGet(request, response);
	}

}
