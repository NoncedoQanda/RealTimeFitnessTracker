package com.fitness.tracker;

public class User {
    private String userId;
    private String name;
    private String email;
    private int workoutCount;

    public User() {}
    public User(String userId, String name, String email) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.workoutCount = 0;
    }

    public String getUserId() { return userId; }
    public void setUserId(String userId) { this.userId = userId; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public int getWorkoutCount() { return workoutCount; }
    public void incrementWorkoutCount() { this.workoutCount++; }
}