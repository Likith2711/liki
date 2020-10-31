package com.tharanga;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.utildb.jdbc;

@WebServlet("/registration")
public class registration extends HttpServlet
{
	private static final long serialVersionUID = 1L;

   	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
   	{
		// TODO Auto-generated method stub
   		
   		
   		try { 

			Connection con = jdbc.initializeDatabase(); 

			PreparedStatement st = con.prepareStatement("insert into  registration values(?,?,?,?,?,?,?,?,?,?,?)"); 
			st.setString(1, request.getParameter("Firstname")); 
			st.setString(2, request.getParameter("Middlename")); 
			st.setString(3, request.getParameter("Lastname")); 
			 
			st.setString(4, request.getParameter("Date Of Birth")); 
			st.setString(5, request.getParameter("Gender")); 
			st.setString(6, request.getParameter("Address")); 
			st.setString(7, request.getParameter("Street Address")); 
			st.setString(8, request.getParameter("City")); 
			st.setString(9, request.getParameter("Pin code")); 
			st.setString(10, request.getParameter("Mobile Number")); 
			st.setString(11, request.getParameter("E-mail")); 
			
			
			st.executeUpdate();
			

			// Close all the connections 
			st.close(); 
			con.close(); 
			
			System.out.println("success");
			
		    } 
		catch (Exception e)
		{ 
          System.out.println(e);	
		} 
		
	}

	

	

	
	
}


