package com.bank.BankApplication.repository;

import com.bank.BankApplication.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CustomerRepository extends JpaRepository<Customer,Long>{
@Query("select user from Customer user where user.email=:email ")
    Customer getUser(@Param("email")String email);
}

