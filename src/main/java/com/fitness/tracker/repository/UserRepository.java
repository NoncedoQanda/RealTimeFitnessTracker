// File: src/main/java/com/fitness/tracker/repository/UserRepository.java
package com.fitness.tracker.repository;

import com.fitness.tracker.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}