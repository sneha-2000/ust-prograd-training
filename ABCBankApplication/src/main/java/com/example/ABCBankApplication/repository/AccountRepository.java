package com.example.AbcBankApplication.repository;

import com.example.AbcBankApplication.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,Long> {
}
