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
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



		try {
			PrintWriter out = response.getWriter(); 
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("class found");

			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:5000/user?autoReconnect=true&useSSL=false", "root", "Bodygaurd@2013");

			System.out.println("Connected");
			
			String n=request.getParameter("userName");  
			String p=request.getParameter("userPass");  
			
			
			Statement stmt = con.createStatement();

			PreparedStatement ps=con.prepareStatement(  
					"SELECT * FROM user.registeruser where NAME=? AND PASS=?");  
					  
					ps.setString(1,n); 
					ps.setString(2,n); 

					ResultSet rs=ps.executeQuery();  
					 if(rs.next())
					 {
						 out.print("Login Succesfull");  
					 }
			
					else
						out.print("Your are not registered, Please do registser <a href='register.html'>register</a>");  

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		doGet(request, response);
	}

}
