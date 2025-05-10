package com.fitness.tracker.service;

     import com.fitness.tracker.domain.Workout;
     import com.fitness.tracker.repository.WorkoutRepository;
     import java.util.Optional;

     public class WorkoutService {
         private final WorkoutRepository workoutRepository;
package com.fitness.tracker.service;

     import com.fitness.tracker.domain.Goal;
     import com.fitness.tracker.repository.GoalRepository;
     import java.util.Optional;

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