package com.fitness.tracker.patterns;

import java.time.LocalDateTime;

public class HeartRate implements Cloneable {
    private String hrId;
    private int bpm;
    private LocalDateTime timestamp;

    public HeartRate(String hrId, int bpm) {
        this.hrId = hrId;
        this.bpm = bpm;
        this.timestamp = LocalDateTime.now();
    }

    @Override
    public HeartRate clone() {
        try {
            return (HeartRate) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    // Getters
    public int getBPM() { return bpm; }
}
