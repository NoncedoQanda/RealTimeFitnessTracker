package com.fitness.tracker.service;

     import com.fitness.tracker.domain.Workout;
     import com.fitness.tracker.repository.WorkoutRepository;
     import org.junit.jupiter.api.BeforeEach;
     import org.junit.jupiter.api.Test;

     import java.time.LocalDateTime;

     import static org.junit.jupiter.api.Assertions.*;

     class WorkoutServiceTest {
         private WorkoutService workoutService;
         private WorkoutRepository workoutRepository;

         @BeforeEach
         void setUp() {
             workoutRepository = new WorkoutRepository();
             workoutService = new WorkoutService(workoutRepository);
         }

         @Test
         void createWorkout_validWorkout_savesWorkout() {
             Workout workout = new Workout("w1", "u1", "Running", 30, LocalDateTime.now());
             Workout savedWorkout = workoutService.createWorkout(workout);
             assertEquals("w1", savedWorkout.getWorkoutId());
             assertEquals(30, savedWorkout.getDuration());
         }

         @Test
         void createWorkout_invalidDuration_throwsException() {
             Workout workout = new Workout("w1", "u1", "Running", 0, LocalDateTime.now());
             assertThrows(IllegalArgumentException.class, () -> workoutService.createWorkout(workout));
         }
     }