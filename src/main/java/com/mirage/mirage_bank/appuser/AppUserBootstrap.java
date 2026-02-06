package com.mirage.mirage_bank.appuser;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class AppUserBootstrap {

    @Bean
    CommandLineRunner seedUser(
            AppUserRepository repo,
            PasswordEncoder encoder
    ) {
        return args -> {
            if (repo.findByUsername("admin").isEmpty()) {
                repo.save(new AppUser(
                        "admin",
                        encoder.encode("password"),
                        "Admin User",
                        AppUserRole.ADMIN,
                        false,
                        true
                ));
            }
        };
    }
}