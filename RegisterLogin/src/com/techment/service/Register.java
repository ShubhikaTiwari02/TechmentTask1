package com.techment.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
	
		
		try {
			
			response.setContentType("text/html");  
			PrintWriter out = response.getWriter();  
			          
			String n=request.getParameter("userName");  
			String p=request.getParameter("userPass");  
			String e=request.getParameter("userEmail");  
			String c=request.getParameter("userCountry");  
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("class found");

			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:5000/user?autoReconnect=true&useSSL=false", "root", "Bodygaurd@2013");

			System.out.println("Connected");
			Statement stmt = con.createStatement();

			//stmt.execute("insert into employee values(2,'sachin',34000)");
 
			
			
			PreparedStatement ps=con.prepareStatement(  
					"insert into registeruser values(?,?,?,?)");  
					  
					ps.setString(1,n);  
					ps.setString(2,p);  
					ps.setString(3,e);  
					ps.setString(4,c);  
					          
					int i=ps.executeUpdate();  
					if(i>0)  
					out.print("You are successfully registered...");  
					else
						out.print("Sorry not Registered...");  
			

		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
		
		
		
		
		
		
		doGet(request, response);
	}

}
