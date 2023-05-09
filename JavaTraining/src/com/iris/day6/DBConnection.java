package com.iris.day6;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {
	
	Connection con;
	
	public Connection getDBConnection() {
		
		try {
		FileInputStream fis = new FileInputStream("com/iris/day6/data.properties");
		Properties props = new Properties();
		props.load(fis);
		
		con = DriverManager.getConnection(props.getProperty("url"),props.getProperty("username"),props.getProperty("password")); 
		
		} catch (SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
}