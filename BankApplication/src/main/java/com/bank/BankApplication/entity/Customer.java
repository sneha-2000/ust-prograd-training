package com.bank.BankApplication.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.persistence.*;




@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long customerId;
    @Column(name = "customername", nullable = false)
    private String customerName;
    @Column(nullable = false)
    private String email;
    @Column(name = "mobilenumber", nullable = false, unique = true, updatable = false)
    private String mobileNumber;

    public Customer(){}

    public  Customer(String customerName ,String email, String mobileNumber) {
        this.customerName = customerName;
        this.email = email;
        this.mobileNumber = mobileNumber;

    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setEmailId(String emailId) {
        this.email = email;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }



//    public void showCustomerAccountDetails() {
//
//        System.out.println("Customer name: " + customerName);
//        System.out.println("Customer id: " + customerId);
//        System.out.println("Customer emailId: " + email);
//        System.out.println("Customer mobileNumber: " + mobileNumber);
//        System.out.println("Account Balance:"+account.getBalanceAmount());
//    }
}




