package com.iris.day6;

import java.util.List;

public interface ServiceInterface {

	boolean MoneyTransfer(int login_account_no, int transfer_To_account, double transfer_amount);

	int Login(String login_username, String login_password);

	List<Transactions> showTransactions(int login_account_no);

	boolean updateContact(String string);

	int Balance(int login_account_no);

	boolean createAccount(String uname, String passwd, String name, String email_id, String birth_date, String pan_no,
			String aadhaar_no, String address);

}
