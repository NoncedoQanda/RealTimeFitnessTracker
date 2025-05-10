package com.fitness.tracker.api;

     import com.fitness.tracker.domain.Goal;
     import com.fitness.tracker.service.GoalService;
     import org.springframework.beans.factory.annotation.Autowired;
     import org.springframework.http.ResponseEntity;
     import org.springframework.web.bind.annotation.*;

     @RestController
     @RequestMapping("/api/goals")
     public class GoalController {
         private final GoalService goalService;

         @Autowired
         public GoalController(GoalService goalService) {
             this.goalService = goalService;
         }

         @PostMapping
public ResponseEntity<Goal> createGoal(@RequestBody Goal goal) {
    Goal createdGoal = goalService.createGoal(goal); // Fix: use goalService
    return ResponseEntity.ok(createdGoal);
}

         @GetMapping("/{goalId}")
         public ResponseEntity<Goal> getGoalById(@PathVariable String goalId) {
             Goal goal = goalService.getGoalById(goalId);
             if (goal != null) {
                 return ResponseEntity.ok(goal);
             }
             return ResponseEntity.notFound().build();
         }
     }