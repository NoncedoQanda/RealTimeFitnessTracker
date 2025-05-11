package com.fitness.tracker.service;

import com.fitness.tracker.model.User;
import com.fitness.tracker.service.UserService;  
import java.util.List;

public interface UserService {
    User createUser(User user);
    List<User> getAllUsers();
    User getUserById(Long id);
    User updateUser(User user);
    void deleteUser(Long id);  // This was likely missing in your implementation
}