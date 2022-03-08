package com.example.AbcBankApplication.repository;

import com.example.AbcBankApplication.entity.Account;
import com.example.AbcBankApplication.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AccountRepository extends JpaRepository<Account,Long> {

    @Query("Select account from Account account where account.accountId=:accountId")
    Account findByAccountId(Long accountId);

    @Query("Select account from Account account where account.customer=:customer")
    Account findByCustomerId(Customer customer);

}
