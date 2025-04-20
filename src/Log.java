package com.fitness.tracker;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Log {
    private String logId;
    private Date date;
    private List<Workout> workouts = new ArrayList<>();

    public Log(String logId, Date date) {
        this.logId = logId;
        this.date = date;
    }

    public void addWorkout(Workout workout) {
        workouts.add(workout);
    }

    public List<Workout> getHistory() {
        return new ArrayList<>(workouts); // Return copy for encapsulation
    }

    // Getters
    public String getLogId() { return logId; }
    public Date getDate() { return date; }
}
