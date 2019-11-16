package com.face.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.face.bo.LoginBO;

public class LoginDAO {

	public static boolean acess(Connection connection, LoginBO lbo) throws SQLException {
		boolean status=false;
		Statement st = null;
		try {
			st = connection.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String qry="SELECT * FROM register where username='"+lbo.getUname()+"' AND password='"+lbo.getPass()+"'";
		
			ResultSet rs=st.executeQuery(qry);
			 if(rs.next()){
			       System.out.println("LoginSucess full");
			       lbo.setName(rs.getString("name"));
			       lbo.setAddress(rs.getString("address"));
			       lbo.setMobile(rs.getString("mobile"));
			       lbo.setEmail(rs.getString("email"));
			       status=true;
			       
			 }
			 else
			 {
				 System.out.println("Login failed");
			 }
			return status;
		} 
	}


