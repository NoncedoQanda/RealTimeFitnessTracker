package com.fitness.tracker.services;

import com.fitness.tracker.User;
import com.fitness.tracker.Workout;
import com.fitness.tracker.repository.UserRepository;
import com.fitness.tracker.repository.WorkoutRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WorkoutServiceTest {
    private WorkoutService workoutService;
    private UserRepository userRepository;
    private WorkoutRepository workoutRepository;

    @BeforeEach
    void setUp() {
        userRepository = new UserRepository();
        workoutRepository = new WorkoutRepository();
        workoutService = new WorkoutService(workoutRepository, userRepository);
        User user = new User("u1", "Alice", "alice@example.com");
        userRepository.save(user);
    }

    @Test
    void createWorkout_validWorkout_savesWorkout() {
        Workout workout = new Workout("w1", "u1", "Running", 30);
        Workout saved = workoutService.createWorkout(workout);
        assertEquals("w1", saved.getWorkoutId());
        assertEquals("Running", saved.getType());
    }

    @Test
    void createWorkout_exceedsLimit_throwsException() {
        User user = userRepository.findById("u1").get();
        for (int i = 0; i < 5; i++) {
            user.incrementWorkoutCount();
        }
        userRepository.save(user);
        Workout workout = new Workout("w1", "u1", "Running", 30);
        assertThrows(IllegalStateException.class, () -> workoutService.createWorkout(workout));
    }
}