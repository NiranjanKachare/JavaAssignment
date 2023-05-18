package com.iris.day6;

import java.util.List;

public class Service implements ServiceInterface{

	Repository r = new Repository();
	
	@Override
	public boolean createAccount(String uname, String passwd, String name, String email_id, String birth_date, String pan_no, String aadhaar_no, String address) {
		// TODO Auto-generated method stub
		if(r.createAccount(uname, passwd, name, email_id, birth_date, pan_no, aadhaar_no, address)) {
			return true;
		}
		return false;
	}

	@Override
	public int Login(String login_username, String login_password) {
		// TODO Auto-generated method stub
		return r.login(login_username, login_password);
	}

	@Override
	public boolean updateContact(String string) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean MoneyTransfer(int login_account_no, int transfer_To_account, double transfer_amount) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Transactions> showTransactions(int login_account_no) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public int Balance(int login_account_no) {
		// TODO Auto-generated method stub
		return r.balance(login_account_no);
	}
}