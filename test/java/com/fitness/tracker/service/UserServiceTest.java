package com.fitness.tracker.service;

     import com.fitness.tracker.domain.User;
     import com.fitness.tracker.repository.UserRepository;
     import org.junit.jupiter.api.BeforeEach;
     import org.junit.jupiter.api.Test;

     import static org.junit.jupiter.api.Assertions.*;

     class UserServiceTest {
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
             User savedUser = userService.createUser(user);
             assertEquals("u1", savedUser.getUserId());
             assertEquals("Alice", savedUser.getName());
         }

         @Test
         void createUser_nullUserId_throwsException() {
             User user = new User(null, "Alice", "alice@example.com");
             assertThrows(IllegalArgumentException.class, () -> userService.createUser(user));
         }

         @Test
         void getUserById_existingUser_returnsUser() {
             User user = new User("u1", "Alice", "alice@example.com");
             userService.createUser(user);
             User foundUser = userService.getUserById("u1");
             assertNotNull(foundUser);
             assertEquals("u1", foundUser.getUserId());
         }

         @Test
         void getUserById_nonExistingUser_returnsNull() {
             User foundUser = userService.getUserById("u2");
             assertNull(foundUser);
         }
     }