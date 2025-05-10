package com.fitness.tracker.api;

     import com.fitness.tracker.domain.Goal;
     import com.fitness.tracker.service.GoalService;
     import org.junit.jupiter.api.Test;
     import org.springframework.beans.factory.annotation.Autowired;
     import org.springframework.boot.test.context.SpringBootTest;
     import org.springframework.boot.test.web.client.TestRestTemplate;
     import org.springframework.http.HttpStatus;
     import org.springframework.http.ResponseEntity;

     import static org.junit.jupiter.api.Assertions.*;

     @SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
     class GoalControllerTest {
         @Autowired
         private TestRestTemplate restTemplate;

         @Autowired
         private GoalService goalService;

         @Test
         void createGoal_validGoal_returnsCreatedGoal() {
             Goal goal = new Goal("g1", "u1", "Run 5km", false);
             ResponseEntity<Goal> response = restTemplate.postForEntity("/api/goals", goal, Goal.class);
             assertEquals(HttpStatus.OK, response.getStatusCode());
             assertNotNull(response.getBody());
             assertEquals("g1", response.getBody().getGoalId());
         }

         @Test
         void getGoalById_existingGoal_returnsGoal() {
             Goal goal = new Goal("g2", "u1", "Lose 5kg", false);
             goalService.createGoal(goal);
             ResponseEntity<Goal> response = restTemplate.getForEntity("/api/goals/g2", Goal.class);
             assertEquals(HttpStatus.OK, response.getStatusCode());
             assertNotNull(response.getBody());
             assertEquals("g2", response.getBody().getGoalId());
         }

         @Test
         void getGoalById_nonExistingGoal_returnsNotFound() {
             ResponseEntity<Goal> response = restTemplate.getForEntity("/api/goals/unknown", Goal.class);
             assertEquals(HttpStatus.NOT_FOUND, response.getStatusCode());
         }
     }