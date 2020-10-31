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



@WebServlet("/login")
public class login extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

   	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
   	{
		// TODO Auto-generated method stub
   		
   		
   		try { 

			Connection con = jdbc.initializeDatabase(); 

			PreparedStatement st = con.prepareStatement("insert into  login values(?,?)"); 
			st.setString(1, request.getParameter("Username")); 
			 
			st.setString(2, request.getParameter("password")); 
			
			
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
