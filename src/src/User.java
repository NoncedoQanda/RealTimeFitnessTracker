package com.fitness.tracker;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String userId;
    private String name;
    private String email;
    private List<Workout> workouts = new ArrayList<>();
    private List<Goal> goals = new ArrayList<>();

    public User(String userId, String name, String email) {
        this.userId = userId;
        this.name = name;
        this.email = email;
    }

    public void login() { /* Simulate login */ }
    public void logout() { /* Simulate logout */ }
    public void setGoal(Goal goal) {
        if (goals.size() < 5) goals.add(goal); // Business rule: max 5 goals
    }

    // Getters
    public String getUserId() { return userId; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public List<Workout> getWorkouts() { return workouts; }
    public List<Goal> getGoals() { return goals; }
}
