package com.fitness.tracker.repository;

     import com.fitness.tracker.domain.User;
     import java.util.HashMap;
     import java.util.Map;
     import java.util.Optional;

     public class UserRepository {
         private final Map<String, User> users = new HashMap<>();

         public User save(User user) {
             users.put(user.getUserId(), user);
             return user;
         }

         public Optional<User> findById(String userId) {
             return Optional.ofNullable(users.get(userId));
         }
     }