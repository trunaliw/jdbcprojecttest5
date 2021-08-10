package com.telstra1.jdbctest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCTestDemo {
	
	public static void main(String [] args)
	{
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		String url="jdbc:mysql://localhost:3306/telstra_tr";
		String username="root";
		String password = "Trunali@123";
		
		String insertCommand="INSERT INTO customers values(1091,'riya','jalandhar')";
		int i=0;
		
		//connection interface
		Connection cn=null;
		Statement st=null;
		try {
			cn=DriverManager.getConnection(url,username,password);
			st=cn.createStatement();
			i=st.executeUpdate(insertCommand);
			System.out.println(i+ " Records Added..... ");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
}
