package com.fitness.tracker.services;

import com.fitness.tracker.User;
import com.fitness.tracker.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class UserServiceTest {
    private UserService userService;
    private UserRepository userRepository;

    @BeforeEach
    void setUp() {
        userRepository = new UserRepository();
        userService = new UserService(userRepository);
    }

    @Test
    void createUser_validUser_savesUser() {
        User user = new User("u1", "Alice", "alice@example.com");
        User saved = userService.createUser(user);
        assertEquals("u1", saved.getUserId());
        assertEquals("Alice", saved.getName());
    }

    @Test
    void createUser_invalidEmail_throwsException() {
        User user = new User("u1", "Alice", "invalid");
        assertThrows(IllegalArgumentException.class, () -> userService.createUser(user));
    }
}