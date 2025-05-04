package com.fitness.tracker.repository;

import com.fitness.tracker.User;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepository {
    private final List<User> users = new ArrayList<>();

    public User save(User user) {
        users.removeIf(u -> u.getUserId().equals(user.getUserId()));
        users.add(user);
        return user;
    }

    public Optional<User> findById(String userId) {
        return users.stream().filter(u -> u.getUserId().equals(userId)).findFirst();
    }

    public List<User> findAll() {
        return new ArrayList<>(users);
    }
}