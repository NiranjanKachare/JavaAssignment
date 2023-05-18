
package com.IRIS.Service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.IRIS.Entity.Transactions;
import com.IRIS.Repository.AccountRepository;


@Service
@Primary
public class AccountService implements AccountServiceInt{
	
	@Autowired
	private EntityManager em;
	
	@Autowired
	private AccountRepository ar;
	
	@Override
	public boolean createAccount(String uname, String password, String full_name, String email_id, String mobile_no, String birth_date, String pan_no, String aadhaar_no, String address) {
		// TODO Auto-generated method stub
		Query q = em.createQuery("insert into Account(username, password, full_name, balance, email_id, mobile_no, birth_date, pan_no, aadhaar_no, address) values('?','?','?','?','?','?','?','?','?','?')");
		q.setParameter(1, uname);
		q.setParameter(2, password);
		q.setParameter(3, full_name);
		q.setParameter(4, 0);
		q.setParameter(5, email_id);
		q.setParameter(6, mobile_no);
		q.setParameter(7, birth_date);
		q.setParameter(8, pan_no);
		q.setParameter(9, aadhaar_no);
		q.setParameter(10, address);
		
		q.executeUpdate();
		return true;
	}

	@Override
	public int Login(String login_username, String login_password) {
		// TODO Auto-generated method stub
		Query q = em.createNamedQuery("select account_id from Account where username = ? and password = ?");
		q.setParameter(1, login_username);
		q.setParameter(2, login_password);
		return q.getFirstResult();
	}

	@Override
	public boolean updateContact(String login_username, String login_password, String new_contact) {
		// TODO Auto-generated method stub
		int Account_id = Login(login_username, login_password);
		
		Query q = em.createNamedQuery("update Account set mobile_no = ? where Account_id = ?");
		q.setParameter(1, new_contact);
		q.setParameter(2, Account_id);
		
		q.executeUpdate();
		return true;
	}
	
	@Override
	public double getBalance(String login_username, String login_password) {
		// TODO Auto-generated method stub
		
		int Account_id = Login(login_username, login_password);
		
		Query q = em.createNamedQuery("select balance from Account where Account_id = ?");
		q.setParameter(1, Account_id);
		
		return (double)q.getSingleResult();
	}

//	@Override
//	public boolean MoneyTransfer(int login_account_no, int transfer_To_account, double transfer_amount) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public List<Transactions> showTransactions(int login_account_no) {
//		// TODO Auto-generated method stub
//		return null;
//	}
}
