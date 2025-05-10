package com.fitness.tracker.repository;

     import com.fitness.tracker.domain.Workout;
     import java.util.HashMap;
     import java.util.Map;
     import java.util.Optional;

     public class WorkoutRepository {
         private final Map<String, Workout> workouts = new HashMap<>();

         public Workout save(Workout workout) {
             workouts.put(workout.getWorkoutId(), workout);
             return workout;
         }

         public Optional<Workout> findById(String workoutId) {
             return Optional.ofNullable(workouts.get(workoutId));
         }
     }