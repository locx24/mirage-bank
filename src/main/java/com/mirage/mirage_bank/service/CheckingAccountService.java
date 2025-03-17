package com.mirage.mirage_bank.service;

import com.mirage.mirage_bank.model.CheckingAccount;
import com.mirage.mirage_bank.model.Customer;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;

// lets spring boot know this is a bean
@Service
public class CheckingAccountService {

    public List<CheckingAccount> getCheckingAccount() {
        return List.of(new CheckingAccount(

                1L,
                5000.0,
                List.of(),
                LocalDate.now(),
                "ACC12345",
                "Active",
                new Customer(1L,"John Doe")
        ));
    }
}
