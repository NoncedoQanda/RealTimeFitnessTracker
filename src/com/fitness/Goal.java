package com.fitness.tracker;

import java.util.Date;

public class Goal {
    private String goalId;
    private float target;
    private String type;
    private Date deadline;

    public Goal(String goalId, float target, String type, Date deadline) {
        this.goalId = goalId;
        this.target = target;
        this.type = type;
        this.deadline = deadline;
    }

    public void setTarget(float target) {
        this.target = target;
    }

    public float checkProgress() {
        // Placeholder: Return progress percentage
        return 0.0f;
    }

    // Getters
    public String getGoalId() { return goalId; }
    public float getTarget() { return target; }
    public String getType() { return type; }
    public Date getDeadline() { return deadline; }
}
