package com.iris.day7;

@Component
public class Accounts { 
	

	class BankAccount {​​​​​

	int bid;
	String name;
	String address;
	public BankAccount(){​​​​​}​​​​​

	public BankAccount(int bid, String name, String address) {​​​​​
		
		this.bid = bid;
		this.name = name;
		this.address = address;
	}​​​​​
	
	public int getBid() {​​​​​
		return bid;
	}​​​​​

	public void setBid(int bid) {​​​​​
		this.bid = bid;
	}​​​​​

	public String getName() {​​​​​
		return name;
	}​​​​​

	public void setName(String name) {​​​​​

		this.name = name;
	}​​​​​
	public String getAddress() {​​​​​

		return address;
	}​​​​​
	public void setAddress(String address) {​​​​​
		this.address = address;
    }​​​​​

	@Override
	public String toString() {​​​​​
		return "BankAccount [bid=" + bid + ", name=" + name + ", address=" + address + "]";
	}​​​​​
}​​​​​​​​​​


}​
