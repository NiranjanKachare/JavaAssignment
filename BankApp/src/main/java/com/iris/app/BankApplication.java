package com.iris.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.Console;
import java.util.Scanner;

@SpringBootApplication
public class BankApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankApplication.class, args);

		Console con = System.console();
		Service ss = new Service();
		String s;

		while(true){

			s = con.readLine("#1. Login.\r\n" +
					"#2. Create Bank Account.\r\n" +
					"#3. Exit.\r\n" +
					"Enter the choice = ");
			switch(s) {

				case "1":

					int login_account_no = 0;
					String login_username = null;
					String login_password = null;

					System.out.println("Enter UserName.");
					Scanner sc = new Scanner(System.in);
					if(sc.hasNext()) {
						login_username = sc.next();
					}
					System.out.println("Enter Password.");
					sc = new Scanner(System.in);
					if(sc.hasNext()) {
						login_password = sc.next();
					}
					login_account_no = ss.Login(login_username,login_password);
					boolean b = false;
					if(login_account_no != 0) {
						b = true;
					}
					while(b) {

						s = con.readLine("#1. View current Balance\r\n" +
								"#2. Transfer amount, need to provide to account number, amount\r\n" +
								"#3. View Transactions\r\n" +
								"#4. Update Contact details \r\n" +
								"#5. Previous Menu" +
								"Enter the choice = ");
						switch(s) {

							case "1" :

								System.out.println("Account Balance is :" + ss.Balance(login_account_no));
								break;

							case "2" :

								int transfer_To_account = 0;
								double transfer_amount = 0;

								System.out.println("Enter Account No.");
								sc = new Scanner(System.in);
								if(sc.hasNext()) {
									transfer_To_account = sc.nextInt();
								}

								System.out.println("Enter Amount to be transfered.");
								sc = new Scanner(System.in);
								if(sc.hasNext()) {
									transfer_amount = sc.nextDouble();
								}

								if(ss.MoneyTransfer(login_account_no, transfer_To_account, transfer_amount)) {
									System.out.println("Money Transfer Successful");
								}else {
									System.out.println("Money Transfer failed");
								}

								break;

							case "3" :

								List<Transactions> list = ss.showTransactions(login_account_no);

								for(Transactions t : list) {
									System.out.println(t.toString());
								}

								break;

							case "4" :
								String uname = "";
								String passwd = "";

								System.out.println("Enter UserName.");
								sc = new Scanner(System.in);
								if(sc.hasNext()) {
									uname = sc.next();
								}
								System.out.println("Enter Password.");
								sc = new Scanner(System.in);
								if(sc.hasNext()) {
									passwd = sc.next();
								}
								if(ss.Login(uname,passwd)!= 0) {

									System.out.println("Enter new contact number.");
									sc = new Scanner(System.in);

									if(sc.hasNext()) {
										if(ss.updateContact(sc.next())) {
											System.out.println("Contact Details updated successfully.");
										}else {
											System.out.println("Update Request Failed.");
										}
									}

								}else {
									System.out.println("Incorrect Username and Password. Login Failed");
								}

								break;

							case "5" :

								b = false;
								break;
						}
					}
					break;

				case "2":
					System.out.println("Created Bank Account");
					String uname = "", passwd = "", name= "", email_id= "", birth_date= "", pan_no= "", aadhaar_no= "", address= "";

					System.out.println("Enter UserName.");
					sc = new Scanner(System.in);
					if(sc.hasNext()) {
						uname = sc.next();
					}
					System.out.println("Enter full Eamil Id.");
					if(sc.hasNext()) {
						email_id = sc.next();
					}
					System.out.println("Enter full birth_date.");
					if(sc.hasNext()) {
						birth_date = sc.next();
					}
					System.out.println("Enter full pan_no.");
					if(sc.hasNext()) {
						pan_no = sc.next();
					}
					System.out.println("Enter full aadhaar_no.");
					if(sc.hasNext()) {
						aadhaar_no = sc.next();
					}
					System.out.println("Enter full address.");
					if(sc.hasNext()) {
						address = sc.next();
					}
					System.out.println("Enter Password.");
					if(sc.hasNext()) {
						passwd = sc.next();
					}
					System.out.println("ReEnter Password.");
					if(sc.hasNext()) {
						if(sc.next().equals(passwd)?true:false) {
							ss.createAccount(uname ,passwd ,name , email_id, birth_date, pan_no, aadhaar_no, address);
						}else {
							System.out.println("Password did not match.");
						}
					}


					break;

				case "3":
					System.exit(0);

				default :
					System.out.println("Invalid Choice\n");

			}
		}


	}

}
