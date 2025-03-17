package com.mirage.mirage_bank;

import com.mirage.mirage_bank.model.CheckingAccount;
import com.mirage.mirage_bank.model.Transaction;
import com.mirage.mirage_bank.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.time.LocalDate;

@SpringBootApplication
public class MirageBankApplication {

	public static void main(String[] args) {
		SpringApplication.run(MirageBankApplication.class, args);
	}
}