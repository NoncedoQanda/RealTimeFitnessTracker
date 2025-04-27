package com.fitness.tracker.repositories.inmemory;

import com.fitness.tracker.Workout;
import com.fitness.tracker.repositories.WorkoutRepository;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public class InMemoryWorkoutRepository implements WorkoutRepository {
    private final Map<String, Workout> storage = new HashMap<>();

    @Override
    public void save(Workout workout) {
        storage.put(workout.getWorkoutId(), workout);
    }

    @Override
    public Optional<Workout> findById(String id) {
        return Optional.ofNullable(storage.get(id));
    }

    @Override
    public List<Workout> findAll() {
        return new ArrayList<>(storage.values());
    }

    @Override
    public void delete(String id) {
        storage.remove(id);
    }
}
