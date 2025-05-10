package com.fitness.tracker.repository;

     import com.fitness.tracker.domain.Goal;
     import java.util.HashMap;
     import java.util.Map;
     import java.util.Optional;

     public class GoalRepository {
         private final Map<String, Goal> goals = new HashMap<>();

         public Goal save(Goal goal) {
             goals.put(goal.getGoalId(), goal);
             return goal;
         }

         public Optional<Goal> findById(String goalId) {
             return Optional.ofNullable(goals.get(goalId));
         }
     }