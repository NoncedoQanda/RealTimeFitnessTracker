package com.fitness.tracker.service;

     import com.fitness.tracker.domain.Workout;
     import com.fitness.tracker.repository.WorkoutRepository;
     import java.util.Optional;

     public class WorkoutService {
         private final WorkoutRepository workoutRepository;

         public WorkoutService(WorkoutRepository workoutRepository) {
             this.workoutRepository = workoutRepository;
         }

         public Workout createWorkout(Workout workout) {
             if (workout.getDuration() <= 0) {
                 throw new IllegalArgumentException("Workout duration must be positive");
             }
             return workoutRepository.save(workout);
         }

         public Workout getWorkoutById(String workoutId) {
             Optional<Workout> workout = workoutRepository.findById(workoutId);
             return workout.orElse(null);
         }
     }