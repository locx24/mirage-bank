package com.mirage.mirage_bank.appuser;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface AppUserRepository extends JpaRepository<AppUser,Long>{

    Optional<AppUser> findByUsername(String username);
}