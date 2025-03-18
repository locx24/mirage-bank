package com.mirage.mirage_bank.service;

import com.mirage.mirage_bank.model.CheckingAccount;
import com.mirage.mirage_bank.repository.CheckingAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

// lets spring boot know this is a bean
@Service
public class CheckingAccountService {


    private final CheckingAccountRepository checkingAccountRepository;

    public CheckingAccountService(CheckingAccountRepository checkingAccountRepository) {
        this.checkingAccountRepository = checkingAccountRepository;
    }

    public List<CheckingAccount> getCheckingAccount() {

       return checkingAccountRepository.findAll();
    }
}
