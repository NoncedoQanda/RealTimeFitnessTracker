 
package com.fitness.tracker.service;

     import com.fitness.tracker.domain.Goal;
     import com.fitness.tracker.repository.GoalRepository;
     import org.springframework.stereotype.Service;
     import java.util.Optional;

     @Service
     public class GoalService {
         private final GoalRepository goalRepository;

         public GoalService(GoalRepository goalRepository) {
             this.goalRepository = goalRepository;
         }

         public Goal createGoal(Goal goal) {
             if (goal.getDescription() == null || goal.getDescription().isEmpty()) {
                 throw new IllegalArgumentException("Goal description is required");
             }
             return goalRepository.save(goal);
         }

         public Goal getGoalById(String goalId) {
             Optional<Goal> goal = goalRepository.findById(goalId);
             return goal.orElse(null);
         }
     }