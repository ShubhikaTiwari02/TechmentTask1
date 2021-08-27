package com.techment.registrationServeltCookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		PrintWriter out = response.getWriter();
	    out.print("press to Login..");
	  
	    String name=request.getParameter("userName");
		@SuppressWarnings("unused")
		String pass = request.getParameter("userPass");
		
		int nameLength = name.length();
		System.out.println("your names is "+name +"size of name " +nameLength);
		
		out.print("your names is "+name +"size of name " +nameLength);
		
		
	
	}

}
