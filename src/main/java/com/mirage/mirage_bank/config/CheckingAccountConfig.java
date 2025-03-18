package com.mirage.mirage_bank.config;

import com.mirage.mirage_bank.repository.CheckingAccountRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.List;
import com.mirage.mirage_bank.model.CheckingAccount;
import java.time.LocalDate;

@Configuration
public class CheckingAccountConfig {



    // grants access to the repository
    @Bean
    CommandLineRunner commandLineRunner(CheckingAccountRepository checkingAccountRepository) {
        return args -> {

        CheckingAccount louisChecking = new CheckingAccount(

                5000.0,
                List.of(),
                LocalDate.now(),
               "ACC123456",
                "ACTIVE",
                "Louis Comeaux"
        );

            CheckingAccount darrenChecking = new CheckingAccount(

                    1200.0,
                    List.of(),
                    LocalDate.now(),
                    "ACC654321",
                    "ACTIVE",
                    "Darren JR"
            );

        // save to database
        checkingAccountRepository.saveAll(

                List.of(louisChecking, darrenChecking)
        );
        };
    }
}
