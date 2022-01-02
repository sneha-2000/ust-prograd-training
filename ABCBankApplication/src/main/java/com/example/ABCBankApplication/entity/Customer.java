package com.example.ABCBankApplication.entity;

import javax.persistence.*;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long customerId;
    @Column(name = "customername", nullable = false)
    private String username;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false, unique = true)
    private String password;
//    @Column(name = "mobilenumber", nullable = false, unique = true, updatable = false)
//    private String mobileNumber;

    public Customer(){}

    public  Customer(String customerName ,String email, String password) {
        this.username = customerName;
        this.email = email;
        this.password = password;
    }

    public String getCustomerName() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

//    public String getMobileNumber() {
//        return mobileNumber;
//    }

    public void setEmailId(String emailId) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    //
//    public void setMobileNumber(String mobileNumber) {
//        this.mobileNumber = mobileNumber;
//    }
    public void setCustomerName(String customerName) {
        this.username = customerName;
    }

}
