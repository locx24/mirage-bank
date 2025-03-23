package com.mirage.mirage_bank.service;

import com.mirage.mirage_bank.model.CheckingAccount;
import com.mirage.mirage_bank.repository.CheckingAccountRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.cache.CacheManagerCustomizers;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

// lets spring boot know this is a bean
@Service
public class CheckingAccountService {


    private final CheckingAccountRepository checkingAccountRepository;
    private final CacheManagerCustomizers cacheManagerCustomizers;

    public CheckingAccountService(CheckingAccountRepository checkingAccountRepository, CacheManagerCustomizers cacheManagerCustomizers) {
        this.checkingAccountRepository = checkingAccountRepository;
        this.cacheManagerCustomizers = cacheManagerCustomizers;
    }

    public List<CheckingAccount> getCheckingAccount() {

       return checkingAccountRepository.findAll();
    }

    // business logic. Add new checking account if the entered checking account doesn't exist
    public void addNewCheckingAccount(CheckingAccount checkingAccount) {

        Optional<CheckingAccount> checkingAccountByNumber = checkingAccountRepository.findByAccountNumber(checkingAccount.getAccountNumber());

        if (checkingAccountByNumber.isPresent()){

            throw new IllegalStateException("Checking account already exists");

        }

        checkingAccountRepository.save(checkingAccount);
    }

    // delete checking account
    public void deleteCheckingAccount(Long checkingAccountID) {

       boolean exists = checkingAccountRepository.existsById(checkingAccountID);

       // check if the checking account exists. if not, throw exception
       if (!exists){
           throw new IllegalStateException("Checking account " + checkingAccountID + "does not exist");
       }

       // if checking account exists, delete it
       checkingAccountRepository.deleteById(checkingAccountID);
    }

    // transactional annotation means we can setters instead of a JPA query to update entities in the database
    // update the checking account's account holder name
@Transactional
    public void updateCheckingAccount(Long checkingAccountID, String accountHolder) {

        CheckingAccount checkingAccount = checkingAccountRepository.findById(checkingAccountID).orElse(null);

        if (accountHolder != null && accountHolder.length() > 0 && !Objects.equals(checkingAccount.getAccountHolder(), accountHolder)){
            checkingAccount.setAccountHolder(accountHolder);
        }
    }
}
