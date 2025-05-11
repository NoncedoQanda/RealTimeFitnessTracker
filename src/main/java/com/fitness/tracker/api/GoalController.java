package com.fitness.tracker.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/goals")
public class GoalController {

    // Simulated in-memory store
    private static final Map<Long, String> goals = new HashMap<>();

    static {
        goals.put(1L, "Run 5km daily");
        goals.put(2L, "Cycle 20km weekly");
    }

    @GetMapping
    public ResponseEntity<List<String>> getAllGoals() {
        return ResponseEntity.ok(new ArrayList<>(goals.values()));
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> getGoalById(@PathVariable Long id) {
        String goal = goals.get(id);
        if (goal != null) {
            return ResponseEntity.ok(goal);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<String> createGoal(@RequestBody String goal) {
        long id = goals.size() + 1L;
        goals.put(id, goal);
        return ResponseEntity.status(201).body(goal);
    }
}
