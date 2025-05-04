package com.fitness.tracker.api;

import com.fitness.tracker.Goal;
import com.fitness.tracker.services.GoalService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/goals")
public class GoalController {
    private final GoalService goalService;

    public GoalController(GoalService goalService) {
        this.goalService = goalService;
    }

    @GetMapping
    public List<Goal> getAllGoals() {
        return goalService.getAllGoals();
    }

    @GetMapping("/{goalId}")
    public ResponseEntity<Goal> getGoalById(@PathVariable String goalId) {
        return goalService.getGoalById(goalId)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Goal createGoal(@RequestBody Goal goal) {
        return goalService.createGoal(goal);
    }

    @PostMapping("/{goalId}/achieve")
    public Goal achieveGoal(@PathVariable String goalId) {
        return goalService.achieveGoal(goalId);
    }
}