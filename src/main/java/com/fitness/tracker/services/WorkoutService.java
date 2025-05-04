package com.fitness.tracker.services;

import com.fitness.tracker.User;
import com.fitness.tracker.Workout;
import com.fitness.tracker.repository.UserRepository;
import com.fitness.tracker.repository.WorkoutRepository;
import java.util.List;
import java.util.Optional;

public class WorkoutService {
    private final WorkoutRepository workoutRepository;
    private final UserRepository userRepository;

    public WorkoutService(WorkoutRepository workoutRepository, UserRepository userRepository) {
        this.workoutRepository = workoutRepository;
        this.userRepository = userRepository;
    }

    public Workout createWorkout(Workout workout) {
        Optional<User> user = userRepository.findById(workout.getUserId());
        if (user.isEmpty()) {
            throw new IllegalArgumentException("User not found");
        }
        if (user.get().getWorkoutCount() >= 5) {
            throw new IllegalStateException("User cannot have more than 5 workouts");
        }
        user.get().incrementWorkoutCount();
        userRepository.save(user.get());
        return workoutRepository.save(workout);
    }

    public Optional<Workout> getWorkoutById(String workoutId) {
        return workoutRepository.findById(workoutId);
    }

    public List<Workout> getAllWorkouts() {
        return workoutRepository.findAll();
    }
}