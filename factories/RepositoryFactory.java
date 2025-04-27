package com.fitness.tracker.factories;

import com.fitness.tracker.repositories.UserRepository;
import com.fitness.tracker.repositories.WorkoutRepository;
import com.fitness.tracker.repositories.inmemory.InMemoryUserRepository;
import com.fitness.tracker.repositories.inmemory.InMemoryWorkoutRepository;

public class RepositoryFactory {
    public static UserRepository getUserRepository(String storageType) {
        switch (storageType) {
            case "MEMORY":
                return new InMemoryUserRepository();
            case "DATABASE":
                throw new UnsupportedOperationException("Database not implemented");
            default:
                throw new IllegalArgumentException("Invalid storage type: " + storageType);
        }
    }

    public static WorkoutRepository getWorkoutRepository(String storageType) {
        switch (storageType) {
            case "MEMORY":
                return new InMemoryWorkoutRepository();
            case "DATABASE":
                throw new UnsupportedOperationException("Database not implemented");
            default:
                throw new IllegalArgumentException("Invalid storage type: " + storageType);
        }
    }
}
