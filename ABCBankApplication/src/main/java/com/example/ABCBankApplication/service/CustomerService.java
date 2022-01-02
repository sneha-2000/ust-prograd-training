package com.example.ABCBankApplication.service;

import com.example.ABCBankApplication.entity.Customer;
import com.example.ABCBankApplication.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepo;
    public Customer saveCustomer(Customer customer){

        return customerRepo.save(customer);
    }


}
