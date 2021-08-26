package com.techment.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LaptopPrice
 */
@WebServlet("/LaptopPrice")
public class LaptopPrice extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LaptopPrice() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");

		int price  = 70000;
		
		
		
		PrintWriter pw = response.getWriter();
		
		int quantity = Integer.parseInt(request.getParameter("laptop"));
		
		pw.print("you have selected " +quantity);
		
		double totalPrice = quantity*price;
		
		pw.print("Total price "+totalPrice);
		
	pw.write("<a href='Cart'>go to cart</a>");
		
	
	Cookie cookie = new Cookie("laptopprice",String.valueOf(totalPrice));
	
	response.addCookie(cookie);
	
	
	
	
	}

}
