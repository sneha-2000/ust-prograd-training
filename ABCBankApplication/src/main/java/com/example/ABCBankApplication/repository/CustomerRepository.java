package com.example.ABCBankApplication.repository;

import com.example.ABCBankApplication.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
