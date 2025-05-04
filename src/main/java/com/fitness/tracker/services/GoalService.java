package com.fitness.tracker.services;

import com.fitness.tracker.Goal;
import com.fitness.tracker.repository.GoalRepository;
import java.util.List;
import java.util.Optional;

public class GoalService {
    private final GoalRepository goalRepository;

    public GoalService(GoalRepository goalRepository) {
        this.goalRepository = goalRepository;
    }

    public Goal createGoal(Goal goal) {
        if (goal.getDescription() == null || goal.getDescription().isEmpty()) {
            throw new IllegalArgumentException("Goal description cannot be empty");
        }
        return goalRepository.save(goal);
    }

    public Optional<Goal> getGoalById(String goalId) {
        return goalRepository.findById(goalId);
    }

    public List<Goal> getAllGoals() {
        return goalRepository.findAll();
    }

    public Goal achieveGoal(String goalId) {
        Optional<Goal> goal = goalRepository.findById(goalId);
        if (goal.isEmpty()) {
            throw new IllegalArgumentException("Goal not found");
        }
        goal.get().setAchieved(true);
        return goalRepository.save(goal.get());
    }
}