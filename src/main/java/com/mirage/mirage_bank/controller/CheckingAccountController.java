package com.mirage.mirage_bank.controller;

import com.mirage.mirage_bank.model.CheckingAccount;
import com.mirage.mirage_bank.service.CheckingAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/checkingAccount")
public class CheckingAccountController {

    // reference to checking account service
    private final CheckingAccountService checkingService;

    @Autowired
    public CheckingAccountController(CheckingAccountService checkingService) {
        this.checkingService = checkingService;
    }

    @GetMapping
    public List<CheckingAccount> getCheckingAccount() {
        return checkingService.getCheckingAccount();
    }

}
