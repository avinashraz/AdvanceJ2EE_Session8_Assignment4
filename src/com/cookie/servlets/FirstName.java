package com.cookie.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/FirstName")
public class FirstName extends HttpServlet {
	private static final long serialVersionUID = 1L; 
    public FirstName() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try{
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
		String n = request.getParameter("UserName1");
		
		Cookie ck = new Cookie("FirstName", n);
		response.addCookie(ck);
		
		out.print("<form action='LastName' method='post'>");
		out.print("<h1 align = center> Setting Cookies Example </h1>");
		out.print("<ul><li><b>Last Name:<input type = 'text' name = 'UserName2'/></b></li></ul><br/>");
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
