package com.mirage.mirage_bank.controller;

import com.mirage.mirage_bank.model.CheckingAccount;
import com.mirage.mirage_bank.service.CheckingAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    // HTTP POST request
    @PostMapping
    public void registerNewCheckingAccount(@RequestBody CheckingAccount checkingAccount) {
        checkingService.addNewCheckingAccount(checkingAccount);
    }


    // HTTP DELETE request
    @DeleteMapping(path = "{checkingAccountID}")
    public void deleteCheckingAccount(@PathVariable("checkingAccountID") Long checkingAccountID) {

        checkingService.deleteCheckingAccount(checkingAccountID);

    }

    // HTTP PUT request
    @PutMapping(path = "{checkingAccountID}")
    public void updateCheckingAccount(

        @PathVariable("checkingAccountID") Long checkingAccountID,
        @RequestParam(required = false) String accountHolder) {
        checkingService.updateCheckingAccount(checkingAccountID,accountHolder);
        }
}
