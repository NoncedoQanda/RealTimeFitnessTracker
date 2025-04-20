package com.fitness.tracker;
import java.time.LocalDateTime;

public class Workout {
    private String workoutId;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String status;
    private HeartRate heartRate;
    private Calorie calorie;

    public Workout(String workoutId) {
        this.workoutId = workoutId;
        this.status = "Inactive";
    }

    public void start() { startTime = LocalDateTime.now(); status = "Active"; }
    public void pause() { status = "Paused"; }
    public void stop() { endTime = LocalDateTime.now(); status = "Inactive"; }

    // Getters and setters for heartRate, calorie
}
