package com.fitness.tracker.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/workouts")
public class WorkoutController {

    private static final Map<Long, String> workouts = new HashMap<>();

    static {
        workouts.put(1L, "Morning Yoga");
        workouts.put(2L, "Evening Run");
    }

    @GetMapping
    public ResponseEntity<List<String>> getAllWorkouts() {
        return ResponseEntity.ok(new ArrayList<>(workouts.values()));
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> getWorkoutById(@PathVariable Long id) {
        String workout = workouts.get(id);
        if (workout != null) {
            return ResponseEntity.ok(workout);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<String> createWorkout(@RequestBody String workout) {
        long id = workouts.size() + 1L;
        workouts.put(id, workout);
        return ResponseEntity.status(201).body(workout);
    }
}
