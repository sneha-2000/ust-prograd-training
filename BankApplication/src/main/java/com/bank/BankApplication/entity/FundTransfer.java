//package com.bank.BankApplication.entity;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import javax.persistence.Entity;
//import javax.persistence.Id;
//
//@Component
//@Entity
//public class FundTransfer {
//    @Id
//    public Long accountId;
//}
//
//













//
//  @Autowired
//  Account account;
//
//  public void fundTransfer(double amount, Customer customer1, Customer customer2, String accountId) {
//        if (accountId == customer1.accountNumber && amount < account.balanceAmount) {
//            customer1.account.balanceAmount = customer1.account.balanceAmount - amount;
//            customer1.showCustomerAccountDetails();
//            System.out.println("The amount " + amount + "  is debited " + " from account number "+ customer1.accountNumber+ " to account number "+ customer2.accountNumber);
//        }
//        else if (accountId == customer2.accountNumber && amount < account.balanceAmount){
//            customer2.account.balanceAmount = customer2.account.balanceAmount + amount;
//            customer2.showCustomerAccountDetails();
//            System.out.println("The amount " + amount + "  is credited " + " to  account number "+ customer2.accountNumber+" from account number"+ customer1.accountNumber);
//        }
//        else{
//            System.out.println("Account not found");
//        }
//    }
//}
//
