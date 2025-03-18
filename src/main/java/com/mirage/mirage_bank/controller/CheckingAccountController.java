package com.mirage.mirage_bank.controller;

import com.mirage.mirage_bank.model.CheckingAccount;
import com.mirage.mirage_bank.service.CheckingAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

// declare REST controller to handle HTTP requests and return data in JSON format
@RestController
// maps request to methods at defined endpoints. In this case the root URL
@RequestMapping("/")
public class CheckingAccountController {

    // reference to checking account service
    private final CheckingAccountService checkingService;

    // constructor. performs the dependency injection and uses the checkingService bean from the checkingAccountService file
    @Autowired
    public CheckingAccountController(CheckingAccountService checkingService) {
        this.checkingService = checkingService;
    }

    // HTTP GET request
    @GetMapping
    public List<CheckingAccount> getCheckingAccount() {
        return checkingService.getCheckingAccount();
    }
}
