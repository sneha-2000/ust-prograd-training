package com.example.AbcBankApplication.service;

import com.example.AbcBankApplication.entity.Account;
import com.example.AbcBankApplication.entity.Customer;
import com.example.AbcBankApplication.repository.AccountRepository;
import com.example.AbcBankApplication.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankService {

        @Autowired
        private CustomerRepository customerRepository;


        public Customer saveCustomer(Customer customer){
            return customerRepository.save(customer);
        }

        public Customer findByEmail(String email){
            return customerRepository.findByEmail(email);
        }

//        public Customer getCustomerById( Customer customer) {
//            return customerRepository.findById(customer.getId()).get();
//        }

//    public List<Customer> getAllCustomers(){
//        return customerRepository.findAll();
//    }

        @Autowired
        private AccountRepository accountRepository;

        public Account saveAccount(Account account) {
            return accountRepository.save(account);
        }

//        public Account findByCustomerId(Long customerId){
//            return accountRepository.findById(customerId).get();
//        }

        public Account getAccountByCustomerId(Customer customer) {
            return accountRepository.findByCustomerId(customer);
        }

        public Account getAccountByAccountId(Long accountId) {
            return accountRepository.findByAccountId(accountId);
        }

//        public Boolean existAccount(Long accountId) {
//            return  accountRepository.existsById(accountId);
//        }
}
