package com.iris.day5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC {
	
//	1 .convert a given jdbc Statement to PreparedStatement.
	
	
	public static void main(String[] args) throws Exception{
	// 1 Load jdbc driver
	Class.forName("com.mysql.cj.jdbc.Driver");

	// 2 Connect to DB
	Connection ct = DriverManager.getConnection("jdbc:mysql://localhost:3316/bankdb", "root", "abcdef");

	// 3 Create Statement
//	Statement st = ct.createStatement();
	
	PreparedStatement ps = ct.prepareStatement("select * from accounts");
	
	// 4 execute statement
//	ResultSet rs = st.executeQuery("select * from accounts");
	
	ResultSet rs = ps.executeQuery();

	// 5 retrieve rows, display
	while(rs.next()){
		System.out.println(rs.getString("name")+"|"+rs.getLong("accountnumber"));
	}

	rs.close();
//	st.close();
	ps.close();
	ct.close();
	}
}
