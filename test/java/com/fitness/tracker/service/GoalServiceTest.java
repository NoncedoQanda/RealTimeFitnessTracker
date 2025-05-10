package com.fitness.tracker.service;

     import com.fitness.tracker.domain.Goal;
     import com.fitness.tracker.repository.GoalRepository;
     import org.junit.jupiter.api.BeforeEach;
     import org.junit.jupiter.api.Test;

     import static org.junit.jupiter.api.Assertions.*;

     class GoalServiceTest {
         private GoalService goalService;
         private GoalRepository goalRepository;

         @BeforeEach
         void setUp() {
             goalRepository = new GoalRepository();
             goalService = new GoalService(goalRepository);
         }

         @Test
         void createGoal_validGoal_savesGoal() {
             Goal goal = new Goal("g1", "u1", "Run 5km", false);
             Goal savedGoal = goalService.createGoal(goal);
             assertEquals("g1", savedGoal.getGoalId());
             assertEquals("Run 5km", savedGoal.getDescription());
         }

         @Test
         void createGoal_emptyDescription_throwsException() {
             Goal goal = new Goal("g1", "u1", "", false);
             assertThrows(IllegalArgumentException.class, () -> goalService.createGoal(goal));
         }
     }