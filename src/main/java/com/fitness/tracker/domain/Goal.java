package com.fitness.tracker.domain;

     public class Goal {
         private String goalId;
         private String userId;
         private String description;
         private boolean achieved;

         public Goal() {}

         public Goal(String goalId, String userId, String description, boolean achieved) {
             this.goalId = goalId;
             this.userId = userId;
             this.description = description;
             this.achieved = achieved;
         }

         // Getters and Setters
         public String getGoalId() { return goalId; }
         public void setGoalId(String goalId) { this.goalId = goalId; }
         public String getUserId() { return userId; }
         public void setUserId(String userId) { this.userId = userId; }
         public String getDescription() { return description; }
         public void setDescription(String description) { this.description = description; }
         public boolean isAchieved() { return achieved; }
         public void setAchieved(boolean achieved) { this.achieved = achieved; }
     }