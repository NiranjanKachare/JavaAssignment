package com.IRIS.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Transactions {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Transaction_id;
	
	@Column
	private String payee;
	
	@Column
	private String receiver;
	
	@Column
	private double amount;
	
	@ManyToOne
	private Account ac;
	
	public int getTransaction_id() {
		return Transaction_id;
	}
	public void setTransaction_id(int transaction_id) {
		Transaction_id = transaction_id;
	}
	public String getPayee() {
		return payee;
	}
	public void setPayee(String payee) {
		this.payee = payee;
	}
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return "Transactions [Transaction_id=" + Transaction_id + ", payee=" + payee + ", receiver=" + receiver
				+ ", amount=" + amount + "]";
	}

}
