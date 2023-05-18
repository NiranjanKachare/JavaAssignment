package com.IRIS.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.IRIS.Entity.Account;
import com.IRIS.Service.AccountServiceInt;

@RestController
@RequestMapping("/bankapp")
public class AccountController {
	
	@Autowired
	public AccountServiceInt sc;
	
	@PostMapping("/createaccount")
	public ResponseEntity<HttpStatus> createAccount(@RequestHeader("uname") String uname, @RequestHeader("password") String password, @RequestHeader("full_name") String full_name, @RequestHeader("email_id") String email_id, @RequestHeader("mobile_no") String mobile_no, @RequestHeader("birth_date") String birth_date, @RequestHeader("pan_no") String pan_no, @RequestHeader("aadhaar_no") String aadhaar_no, @RequestHeader("address") String address){
		sc.createAccount(full_name, uname, password, email_id, mobile_no, birth_date, pan_no, aadhaar_no, address);
		return new ResponseEntity<HttpStatus>(HttpStatus.CREATED);
	}
	
	
	@PostMapping("/login")
	public ResponseEntity<HttpStatus> Login(@RequestHeader("username") String username, @RequestHeader("password") String password){
		sc.Login(username, password);
		return new ResponseEntity<HttpStatus>(HttpStatus.ACCEPTED);
	}
	
	@PatchMapping("/updatecontact")
	public ResponseEntity<HttpStatus> updatecontact(@RequestHeader("username") String username, @RequestHeader("password") String password, @RequestHeader("contact") String contact){
		sc.updateContact(username, password, contact);
		return new ResponseEntity<HttpStatus>(HttpStatus.GONE);
		
	}
	
	@GetMapping("/currentbalance")
	public ResponseEntity<Double> getbalance(@RequestHeader("username") String username, @RequestHeader("password") String password){
		Double s = sc.getBalance(username, password);
		return new ResponseEntity<Double>(s,HttpStatus.FOUND);
	}

}