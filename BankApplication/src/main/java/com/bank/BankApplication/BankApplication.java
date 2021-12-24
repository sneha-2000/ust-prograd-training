package com.bank.BankApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


//Create a Spring Boot application for ABC Bank. using this application,
// the customers of the bank should be able to access their account details
// and transfer funds to the other accounts of the same bank. This application
// should consist of the following entities:
//Customer: To store information about the customers of the bank
//Account:To store information about the existing accounts of the bank
//FundTransfer: To store information about the funds that are transferred from one account to the other.
//Create the application and inject dependencies in the entities


//To avail online services of the bank, the customers have to log in to the website by using their
// username and password. After the customers successfully log into the website, they can view their
// account details on the user account page.

@SpringBootApplication
public class BankApplication {

	public static void main(String[] args) {

	ApplicationContext context = SpringApplication.run(BankApplication.class, args);

		Customer customer1=context.getBean(Customer.class);
		Customer customer2=context.getBean(Customer.class);

		customer1.setDetailsOfCustomer("Sneha Pradeep","101",21,"8764534323","New Delhi","1","Kalkaji");
		customer2.setDetailsOfCustomer("Sandra","102",18,"9234522345","Andrews Ganj","2","Sadiq Nagar");

		Account account = context.getBean(Account.class);
		account.setBalanceAmount(1000);

		FundTransfer fundTransfer=context.getBean(FundTransfer.class);
		fundTransfer.fundTransfer(500,customer1,customer2,"2");
	}
}
