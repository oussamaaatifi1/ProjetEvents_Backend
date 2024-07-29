package com.banksystem.projeteventbackend.repository;

import com.banksystem.projeteventbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findUserByUsername(String username);
    @Query("SELECT COUNT  (*) from  User ")
    long countUsers();


}
