package com.face.dao;

import java.sql.Connection;
import java.sql.Statement;

import com.face.bo.RegisterBO;

public class RegisterDAO {

	public static void save(Connection connection, RegisterBO regbo)throws Exception {
		Statement st=connection.createStatement();
		String qry="INSERT INTO register VALUES('"+regbo.getName()+"','"+regbo.getAddress()+"','"+regbo.getMobile()+"','"+regbo.getEmail()+"','"+regbo.getUsername()+"','"+regbo.getPassword()+"')";
		int resultset=st.executeUpdate(qry);
		
		if(resultset==1) {
			System.out.println("Data inserted sucessfully");
			
		}
		else
		{
			System.out.println("Please check");
		}
	}
	

}
