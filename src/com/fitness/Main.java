package com.fitness.tracker;

import com.fitness.tracker.patterns.WorkoutFactory;

public class Main {
    public static void main(String[] args) {
        // Example: Use Simple Factory to create a Workout
        WorkoutFactory factory = new WorkoutFactory();
        Workout workout = factory.createWorkout("cardio", "W1");
        workout.start();
        System.out.println("Workout started: " + workout.getWorkoutId());

        // Add more test code (e.g., create User, Goal, etc.)
    }
}
