package com.fitness.tracker.api;

     import com.fitness.tracker.domain.Workout;
     import com.fitness.tracker.service.WorkoutService;
     import org.junit.jupiter.api.Test;
     import org.springframework.beans.factory.annotation.Autowired;
     import org.springframework.boot.test.context.SpringBootTest;
     import org.springframework.boot.test.web.client.TestRestTemplate;
     import org.springframework.http.HttpStatus;
     import org.springframework.http.ResponseEntity;

     import java.time.LocalDateTime;

     import static org.junit.jupiter.api.Assertions.*;

     @SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
     class WorkoutControllerTest {
         @Autowired
         private TestRestTemplate restTemplate;

         @Autowired
         private WorkoutService workoutService;

         @Test
         void createWorkout_validWorkout_returnsCreatedWorkout() {
             Workout workout = new Workout("w1", "u1", "Running", 30, LocalDateTime.now());
             ResponseEntity<Workout> response = restTemplate.postForEntity("/api/workouts", workout, Workout.class);
             assertEquals(HttpStatus.OK, response.getStatusCode());
             assertNotNull(response.getBody());
             assertEquals("w1", response.getBody().getWorkoutId());
         }

         @Test
         void getWorkoutById_existingWorkout_returnsWorkout() {
             Workout workout = new Workout("w2", "u1", "Cycling", 45, LocalDateTime.now());
             workoutService.createWorkout(workout);
             ResponseEntity<Workout> response = restTemplate.getForEntity("/api/workouts/w2", Workout.class);
             assertEquals(HttpStatus.OK, response.getStatusCode());
             assertNotNull(response.getBody());
             assertEquals("w2", response.getBody().getWorkoutId());
         }

         @Test
         void getWorkoutById_nonExistingWorkout_returnsNotFound() {
             ResponseEntity<Workout> response = restTemplate.getForEntity("/api/workouts/unknown", Workout.class);
             assertEquals(HttpStatus.NOT_FOUND, response.getStatusCode());
         }
     }