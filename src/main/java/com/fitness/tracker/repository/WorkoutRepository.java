package com.fitness.tracker.repository;

import com.fitness.tracker.Workout;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class WorkoutRepository {
    private final List<Workout> workouts = new ArrayList<>();

    public Workout save(Workout workout) {
        workouts.removeIf(w -> w.getWorkoutId().equals(workout.getWorkoutId()));
        workouts.add(workout);
        return workout;
    }

    public Optional<Workout> findById(String workoutId) {
        return workouts.stream().filter(w -> w.getWorkoutId().equals(workoutId)).findFirst();
    }

    public List<Workout> findAll() {
        return new ArrayList<>(workouts);
    }
}