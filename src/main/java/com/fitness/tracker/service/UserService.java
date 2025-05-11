package com.fitness.tracker.service;

     import com.fitness.tracker.domain.User;
     import com.fitness.tracker.repository.UserRepository;
     import org.springframework.stereotype.Service;
     import java.util.Optional;

     @Service
     public class UserService {
         private final UserRepository userRepository;

         public UserService(UserRepository userRepository) {
             this.userRepository = userRepository;
         }

         public User createUser(User user) {
             if (user.getUserId() == null || user.getEmail() == null) {
                 throw new IllegalArgumentException("User ID and email are required");
             }
             return userRepository.save(user);
         }

         public User getUserById(String userId) {
             Optional<User> user = userRepository.findById(userId);
             return user.orElse(null);
         }
     }