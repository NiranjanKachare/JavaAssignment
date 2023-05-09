package com.iris.day6;

public class Transactions {
	
	private int Transaction_id;
	private String payee;
	private String receiver;
	private double amount;
	
	
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
