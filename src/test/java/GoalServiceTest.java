package com.fitness.tracker.services;

import com.fitness.tracker.Goal;
import com.fitness.tracker.repository.GoalRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GoalServiceTest {
    private GoalService goalService;
    private GoalRepository goalRepository;

    @BeforeEach
    void setUp() {
        goalRepository = new GoalRepository();
        goalService = new GoalService(goalRepository);
    }

    @Test
    void createGoal_validGoal_savesGoal() {
        Goal goal = new Goal("g1", "u1", "Run 5km");
        Goal saved = goalService.createGoal(goal);
        assertEquals("g1", saved.getGoalId());
        assertEquals("Run 5km", saved.getDescription());
    }

    @Test
    void achieveGoal_existingGoal_marksAchieved() {
        Goal goal = new Goal("g1", "u1", "Run 5km");
        goalRepository.save(goal);
        Goal achieved = goalService.achieveGoal("g1");
        assertTrue(achieved.isAchieved());
    }
}