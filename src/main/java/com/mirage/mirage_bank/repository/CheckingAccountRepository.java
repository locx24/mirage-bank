package com.mirage.mirage_bank.repository;

import com.mirage.mirage_bank.model.CheckingAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface CheckingAccountRepository extends JpaRepository<CheckingAccount, Long> {


    @Query("SELECT s FROM CheckingAccount s WHERE s.accountNumber = ?1")
    Optional<CheckingAccount> findByAccountNumber(String accountNumber);
}
