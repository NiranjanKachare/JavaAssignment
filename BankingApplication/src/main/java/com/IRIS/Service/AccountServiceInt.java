package com.IRIS.Service;

import java.util.List;

import com.IRIS.Entity.Transactions;

public interface AccountServiceInt {
	
	int Login(String login_username, String login_password);

	boolean updateContact(String login_username, String login_password, String string);

	double getBalance(String login_username, String login_password);

	boolean createAccount(String uname, String password, String full_name, String email_id, String mobile_no,
			String birth_date, String pan_no, String aadhaar_no, String address);
	
//	boolean MoneyTransfer(int login_account_no, int transfer_To_account, double transfer_amount);
//	List<Transactions> showTransactions(int login_account_no);
}
