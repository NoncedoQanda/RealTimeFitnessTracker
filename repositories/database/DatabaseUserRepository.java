package com.fitness.tracker.repositories.database;

import com.fitness.tracker.User;
import com.fitness.tracker.repositories.UserRepository;
import java.util.List;
import java.util.Optional;

public class DatabaseUserRepository implements UserRepository {
    public DatabaseUserRepository() {
        // Initialize DB connection (stub)
    }

    @Override
    public void save(User user) {
        throw new UnsupportedOperationException("Database storage not implemented");
    }

    @Override
    public Optional<User> findById(String id) {
        throw new UnsupportedOperationException("Database storage not implemented");
    }

    @Override
    public List<User> findAll() {
        throw new UnsupportedOperationException("Database storage not implemented");
    }

    @Override
    public void delete(String id) {
        throw new UnsupportedOperationException("Database storage not implemented");
    }
}
