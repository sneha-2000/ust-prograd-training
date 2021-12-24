package com.bank.BankApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("prototype")
public class Customer {

    public String customerName;
    public String customerId;
    public int age;
    public String mobileNumber;
    public String address;
    public String accountNumber;
    public String branchName;

    @Autowired
    Account account;

    public void setDetailsOfCustomer(String customerName, String customerId, int age, String mobileNumber, String address, String accountNumber, String branchName) {
        this.customerName = customerName;
        this.customerId = customerId;
        this.age = age;
        this.mobileNumber = mobileNumber;
        this.address = address;
        this.accountNumber = accountNumber;
        this.branchName = branchName;
    }


    public void showCustomerAccountDetails() {

        System.out.println("Customer name: " + customerName);
        System.out.println("Customer id: " + customerId);
        System.out.println("Customer age: " + age);
        System.out.println("Customer mobileNumber: " + mobileNumber);
        System.out.println("Customer address: " + address);
        System.out.println("Customer account number: " + accountNumber);
        System.out.println("Customer branch name: " + branchName);
        System.out.println("Account Balance:"+account.getBalanceAmount());
    }
}




