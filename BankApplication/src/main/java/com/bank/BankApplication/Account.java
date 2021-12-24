package com.bank.BankApplication;
import org.springframework.stereotype.Component;

@Component
public class Account {

    public double balanceAmount ;

    public void setBalanceAmount(double balanceAmount) {
        this.balanceAmount = balanceAmount;
    }

    public double getBalanceAmount() {
        return balanceAmount;
    }



}


