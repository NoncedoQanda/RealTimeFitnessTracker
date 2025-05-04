package com.fitness.tracker.api;

import com.fitness.tracker.Workout;
import com.fitness.tracker.services.WorkoutService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/workouts")
public class WorkoutController {
    private final WorkoutService workoutService;

    public WorkoutController(WorkoutService workoutService) {
        this.workoutService = workoutService;
    }

    @GetMapping
    public List<Workout> getAllWorkouts() {
        return workoutService.getAllWorkouts();
    }

    @GetMapping("/{workoutId}")
    public ResponseEntity<Workout> getWorkoutById(@PathVariable String workoutId) {
        return workoutService.getWorkoutById(workoutId)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Workout createWorkout(@RequestBody Workout workout) {
        return workoutService.createWorkout(workout);
    }

    @PostMapping("/{workoutId}/complete")
    public ResponseEntity<Workout> completeWorkout(@PathVariable String workoutId) {
        return workoutService.getWorkoutById(workoutId)
                .map(workout -> ResponseEntity.ok(workout))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}