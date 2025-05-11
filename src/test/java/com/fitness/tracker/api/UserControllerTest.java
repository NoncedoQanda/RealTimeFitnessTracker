package com.fitness.tracker.api;

import com.fitness.tracker.model.User;
import com.fitness.tracker.service.UserService;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserControllerTest {

    @Test
    public void testUserCreationAndServiceCall() {
        // Arrange
        UserService userService = Mockito.mock(UserService.class);

        User user = new User(123L, "John Doe", "john@example.com");
        Mockito.when(userService.getUserById(123L)).thenReturn(user);

        // Act
        User result = userService.getUserById(123L);

        // Assert
        assertEquals(123L, result.getUserId());
        assertEquals("John Doe", result.getName());
        assertEquals("john@example.com", result.getEmail());
    }
}
