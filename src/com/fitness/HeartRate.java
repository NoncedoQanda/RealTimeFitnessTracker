package com.fitness.tracker;

import java.time.LocalDateTime;

public class HeartRate {
    private String hrId;
    private int bpm;
    private LocalDateTime timestamp;

    public HeartRate(String hrId, int bpm) {
        this.hrId = hrId;
        this.bpm = bpm;
        this.timestamp = LocalDateTime.now();
    }

    public void record() {
        // Simulate recording new BPM
        this.timestamp = LocalDateTime.now();
    }

    public int getBPM() {
        return bpm;
    }

    // Getters
    public String getHrId() { return hrId; }
    public LocalDateTime getTimestamp() { return timestamp; }

    // Setter for testing
    public void setBPM(int bpm) { this.bpm = bpm; }
}
