package com.fitness.tracker.patterns;

import java.util.Date;

public class GoalBuilder {
    private String goalId;
    private float target;
    private String type;
    private Date deadline;

    public GoalBuilder setGoalId(String goalId) {
        this.goalId = goalId;
        return this;
    }

    public GoalBuilder setTarget(float target) {
        this.target = target;
        return this;
    }

    public GoalBuilder setType(String type) {
        this.type = type;
        return this;
    }

    public GoalBuilder setDeadline(Date deadline) {
        this.deadline = deadline;
        return this;
    }

    public Goal build() {
        return new Goal(goalId, target, type, deadline);
    }
}
