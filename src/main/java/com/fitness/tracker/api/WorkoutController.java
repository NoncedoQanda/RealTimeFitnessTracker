package com.fitness.tracker.api;

     import com.fitness.tracker.domain.Workout;
     import com.fitness.tracker.service.WorkoutService;
     import org.springframework.beans.factory.annotation.Autowired;
     import org.springframework.http.ResponseEntity;
     import org.springframework.web.bind.annotation.*;

     @RestController
     @RequestMapping("/api/workouts")
     public class WorkoutController {
         private final WorkoutService workoutService;

         @Autowired
         public WorkoutController(WorkoutService workoutService) {
             this.workoutService = workoutService;
         }

         @PostMapping
         public ResponseEntity<Workout> createWorkout(@RequestBody Workout workout) {
             Workout createdWorkout = workoutService.createWorkout(workout);
             return ResponseEntity.ok(createdWorkout);
         }

         @GetMapping("/{workoutId}")
         public ResponseEntity<Workout> getWorkoutById(@PathVariable String workoutId) {
             Workout workout = workoutService.getWorkoutById(workoutId);
             if (workout != null) {
                 return ResponseEntity.ok(workout);
             }
             return ResponseEntity.notFound().build();
         }
     }