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
 * Servlet implementation class Name
 */
@WebServlet("/Name")
public class Name extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Name() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<h1 align = center> Setting Cookies Example </h1>");
		Cookie ck[] = request.getCookies();
		for( Cookie cookie:ck){
			out.print("<ul><li><b>"+cookie.getName()+":</b> " +cookie.getValue()+"</li></ul>");
		}
		out.print("<input type = 'submit' value = 'Read Cookies'/><br/><br/>");
		out.print("<input type = 'reset' value = 'Delete Cookies'/>");
	}

}
