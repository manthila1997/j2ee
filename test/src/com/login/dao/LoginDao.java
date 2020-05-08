package com.login.dao;

import java.sql.DriverManager;

import com.sun.jdi.connect.spi.Connection;

import java.sql.*;

public class LoginDao {
	
	public boolean check(String uname, String pword) {
		
		
		String url = "jdbc:mysql://localhost:3306/users";
		String username = "root";
		String password = "";
		String sql = "select * from actors where name? and pword?";
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			java.sql.Connection con = DriverManager.getConnection(url,username,password);
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, uname);
			st.setString(2, pword);
			
			ResultSet rs =st.executeQuery();
			if (rs.next()) {
				return true;
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}
		
		
		return false;	
	}
	

}
