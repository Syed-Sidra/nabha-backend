package com.nabha.learning.nabhaLearning_backend.repository;

import com.nabha.learning.nabhaLearning_backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {  // Basic CRUD auto
    Optional<User> findByEmail(String email);  // Custom query for login
}