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
@RestController
public class MirageBankApplication {

	public static void main(String[] args) {
		SpringApplication.run(MirageBankApplication.class, args);
	}

	@GetMapping
	public List <CheckingAccount> hello() {
		return List.of(new CheckingAccount(

						1L,
						5000.0,
						List.of(),
						LocalDate.now(),
						"ACC12345",
						"Active",
						new User(1L,"John Doe")
		));
	}
}
