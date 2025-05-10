package com.fitness.tracker.api;

     import com.fitness.tracker.domain.User;
     import com.fitness.tracker.service.UserService;
     import org.junit.jupiter.api.Test;
     import org.springframework.beans.factory.annotation.Autowired;
     import org.springframework.boot.test.context.SpringBootTest;
     import org.springframework.boot.test.web.client.TestRestTemplate;
     import org.springframework.http.HttpStatus;
     import org.springframework.http.ResponseEntity;

     import static org.junit.jupiter.api.Assertions.*;

     @SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
     class UserControllerTest {
         @Autowired
         private TestRestTemplate restTemplate;

         @Autowired
         private UserService userService;

         @Test
         void createUser_validUser_returnsCreatedUser() {
             User user = new User("u1", "Alice", "alice@example.com");
             ResponseEntity<User> response = restTemplate.postForEntity("/api/users", user, User.class);
             assertEquals(HttpStatus.OK, response.getStatusCode());
             assertNotNull(response.getBody());
             assertEquals("u1", response.getBody().getUserId());
         }

         @Test
         void getUserById_existingUser_returnsUser() {
             User user = new User("u2", "Bob", "bob@example.com");
             userService.createUser(user);
             ResponseEntity<User> response = restTemplate.getForEntity("/api/users/u2", User.class);
             assertEquals(HttpStatus.OK, response.getStatusCode());
             assertNotNull(response.getBody());
             assertEquals("u2", response.getBody().getUserId());
         }

         @Test
         void getUserById_nonExistingUser_returnsNotFound() {
             ResponseEntity<User> response = restTemplate.getForEntity("/api/users/unknown", User.class);
             assertEquals(HttpStatus.NOT_FOUND, response.getStatusCode());
         }
     }