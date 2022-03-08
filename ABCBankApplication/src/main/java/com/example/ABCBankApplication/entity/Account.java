package com.example.AbcBankApplication.entity;
import javax.persistence.*;

@Entity
public class Account {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)// @GeneratedValue(generator="uuid") \n @GenericGenerator(name="uuid,strategy="uuid2")
        private Long accountId;
        @Column(nullable=false)
        private String customerName;
        @Column(nullable = false)
        private String IFSCCode;
        private String address;
        private Double balanceAmount;

        @OneToOne
        private Customer customer;

        Account(){}

        public Account(Customer customer, String customerName,String IFSCCode,String address,Double balanceAmount) {
            this.customer = customer;
            this.customerName = customerName;
            this.IFSCCode = IFSCCode;
            this.address = address ;
            this.balanceAmount = balanceAmount;
        }


        public Long getAccountId() {
            return accountId;
        }

        public void setAccountId(Long accountId) {
            this.accountId = accountId;
        }

        public void setBalanceAmount(Double balanceAmount) {
            this.balanceAmount = balanceAmount;
        }

        public Double getBalanceAmount() {
            return balanceAmount;
        }

         public String getIFSCCode() {
        return IFSCCode;
     }

        public String getCustomerName() {
        return customerName;
    }

        public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

        public Customer getCustomer() {
        return customer;
    }

        public void setCustomer(Customer customer) {
        this.customer = customer;
    }

        public void setIFSCCode(String IFSCCode) {
        this.IFSCCode = IFSCCode;
     }

        public String getAddress() {
        return address;
        }

        public void setAddress(String address) {
        this.address = address;
        }

}


