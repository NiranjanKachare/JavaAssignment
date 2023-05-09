package com.iris.day6;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Repository{
	
	DBConnection dbcon = new DBConnection();
	
	public boolean createAccount(String uname, String passwd, String name, String email_id, String birth_date, String pan_no, String aadhaar_no, String address) {
		
		Connection con = dbcon.getDBConnection();
		
		PreparedStatement ps;
		try {
			
			ps = con.prepareStatement(String.format("insert into Bank.Account(name, username, password, balance, email_id, birth_date, pan_no, aadhaar_no, address) values('%s','%s','%s','%s','%s','%s','%s','%s','%s')", name, uname , passwd, email_id, birth_date, pan_no, aadhaar_no, address ));	
			return ps.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return false;
	}
	
	public int login(String login_username, String login_password) {
		
		Connection con = dbcon.getDBConnection();
		
		PreparedStatement ps;
		try {
			
			ps = con.prepareStatement(String.format("select account_id from Bank.Account where login_username == '%s' && login_password == '%s' ",login_username, login_password));	
			ResultSet rs = ps.executeQuery();
			return rs.getInt("account_id");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	public int balance(int login_account_no) {
		// TODO Auto-generated method stub
		
		Connection con = dbcon.getDBConnection();
		
		PreparedStatement ps;
		try {
			
			ps = con.prepareStatement(String.format("select balance from Bank.Account where account_id = %s", login_account_no));	
			ResultSet rs = ps.executeQuery();
			return rs.getInt("balance");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return 0;
	}
	
	
	
	
	
}