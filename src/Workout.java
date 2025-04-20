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

    public void start() {
        startTime = LocalDateTime.now();
        status = "Active";
        heartRate = new HeartRate("HR-" + workoutId, 0);
        calorie = new Calorie("CAL-" + workoutId, 0.0f);
    }

    public void pause() { status = "Paused"; }
    public void stop() {
        endTime = LocalDateTime.now();
        status = "Inactive";
    }

    // Getters
    public String getWorkoutId() { return workoutId; }
    public LocalDateTime getStartTime() { return startTime; }
    public LocalDateTime getEndTime() { return endTime; }
    public String getStatus() { return status; }
    public HeartRate getHeartRate() { return heartRate; }
    public Calorie getCalorie() { return calorie; }
}
