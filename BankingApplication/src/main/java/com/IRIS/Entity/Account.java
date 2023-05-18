package com.IRIS.Entity;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Account {
		
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer account_id;
	
	@Column
	private String name;
	
	@Column
	private String username;
	
	@Column
	private String password;
	
	@Column
	private double balance;
	
	@Column
	private String email_id;
	
	@Column
	private String mobile_no;
	
	@Column
	private String birth_date;
	
	@Column
	private String pan_no;
		
	@Column
	private String aadhaar_no;
		
	@Column
	private String address;
	
//	@OneToMany(mappedBy="ac",fetch=FetchType.LAZY)
//	private List<Transactions> tsc = new ArrayList();
//		
		
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getMobile_no() {
		return mobile_no;
	}
	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}
	public String getBirth_date() {
		return birth_date;
	}
	public void setBirth_date(String birth_date) {
		this.birth_date = birth_date;
	}
	public String getPan_no() {
		return pan_no;
	}
	public void setPan_no(String pan_no) {
		this.pan_no = pan_no;
	}
	public String getAadhaar_no() {
		return aadhaar_no;
	}
	public void setAadhaar_no(String aadhaar_no) {
		this.aadhaar_no = aadhaar_no;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAccount_id() {
		return account_id;
	}
	public double getBalance() {
		return balance;
	}
	@Override
	public String toString() {
		return "Account [Name=" + name + ", email_id=" + email_id + ", mobile_no=" + mobile_no + ", birth_date="
				+ birth_date + ", pan_no=" + pan_no + ", aadhaar_no=" + aadhaar_no + ", address=" + address + "]";
	}
}