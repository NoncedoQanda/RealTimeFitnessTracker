package com.fitness.tracker.repository;

import com.fitness.tracker.Goal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class GoalRepository {
    private final List<Goal> goals = new ArrayList<>();

    public Goal save(Goal goal) {
        goals.removeIf(g -> g.getGoalId().equals(goal.getGoalId()));
        goals.add(goal);
        return goal;
    }

    public Optional<Goal> findById(String goalId) {
        return goals.stream().filter(g -> g.getGoalId().equals(goalId)).findFirst();
    }

    public List<Goal> findAll() {
        return new ArrayList<>(goals);
    }
}