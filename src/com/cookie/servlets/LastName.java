package com.cookie.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LastName
 */
@WebServlet("/LastName")
public class LastName extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LastName() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try{
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
		String n = request.getParameter("UserName2");
		Cookie ck = new Cookie("LastName", n);
		response.addCookie(ck);
		
		out.print("<form action='Name' method='post'>");
		out.print("<h1 align = center> Setting Cookies Example </h1>");
		out.print("<input type = 'submit' value = 'Read Cookies'/><br/><br/>");
		out.print("<input type = 'reset' value = 'Delete Cookies'/>");
		out.print("</form>");
		out.close();
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
