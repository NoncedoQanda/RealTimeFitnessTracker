package com.fitness.tracker;

import java.time.LocalDateTime;

public class Calorie {
    private String calId;
    private float value;
    private LocalDateTime timestamp;

    public Calorie(String calId, float value) {
        this.calId = calId;
        this.value = value;
        this.timestamp = LocalDateTime.now();
    }

    public void calculate() {
        // Simulate calorie calculation
        this.timestamp = LocalDateTime.now();
    }

    public float getValue() {
        return value;
    }

    // Getters
    public String getCalId() { return calId; }
    public LocalDateTime getTimestamp() { return timestamp; }

    // Setter for testing
    public void setValue(float value) { this.value = value; }
}
