package com.bank.BankApplication.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("prototype")
public class Customer {

    public String customerName;
    public String customerId;
    public String emailId;
    public String mobileNumber;
    public String address;
    public String accountNumber;
    public String branchName;

    public Customer(){}

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getEmailId() {
        return emailId;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Autowired
    Account account;

    public void setDetailsOfCustomer(String customerName, String customerId, String emailId, String mobileNumber, String address, String accountNumber, String branchName) {
        this.customerName = customerName;
        this.customerId = customerId;
        this.emailId = emailId;
        this.mobileNumber = mobileNumber;
        this.address = address;
        this.accountNumber = accountNumber;
        this.branchName = branchName;
    }


    public void showCustomerAccountDetails() {

        System.out.println("Customer name: " + customerName);
        System.out.println("Customer id: " + customerId);
        System.out.println("Customer emailId: " + emailId);
        System.out.println("Customer mobileNumber: " + mobileNumber);
        System.out.println("Customer address: " + address);
        System.out.println("Customer account number: " + accountNumber);
        System.out.println("Customer branch name: " + branchName);
        System.out.println("Account Balance:"+account.getBalanceAmount());
    }
}




