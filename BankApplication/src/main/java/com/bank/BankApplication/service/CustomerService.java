package com.bank.BankApplication.service;

import com.bank.BankApplication.entity.Customer;
import com.bank.BankApplication.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository repo;
    public Customer saveCustomer(Customer customer){

        return repo.save(customer);
    }

    public Customer getCustomerDetails(String email){
        return repo.getUser(email);
    }
//    public List<Customer>listAll(){
//
//        return repo.findAll();
//    }

}
