package com.iris.Bean;

public class Account {

    @id
    private int account_id;
    private String name;
    private String username;
    private String password;
    private double balance;
    private String email_id;
    private Long mobile_no;
    private String birth_date;
    private String pan_no;
    private String aadhaar_no;
    private String address;


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
    public Long getMobile_no() {
        return mobile_no;
    }
    public void setMobile_no(Long mobile_no) {
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
