package com.login;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.login.dao.LoginDao;


@WebServlet("/login")
public class login extends HttpServlet {
	
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String uname = request.getParameter("uname");
			String pword = request.getParameter("pword");
			
			LoginDao dao = new LoginDao();
			
			if (dao.check(uname, pword)) {
				response.sendRedirect("welcome.jsp");
				
			}else {
				response.sendRedirect("login.jsp");
			}
			
			
				
	}



}
