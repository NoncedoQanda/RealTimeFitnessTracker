package com.fitness.tracker.domain;

     import java.time.LocalDateTime;

     public class Workout {
         private String workoutId;
         private String userId;
         private String type;
         private int duration;
         private LocalDateTime date;

         public Workout() {}

         public Workout(String workoutId, String userId, String type, int duration, LocalDateTime date) {
             this.workoutId = workoutId;
             this.userId = userId;
             this.type = type;
             this.duration = duration;
             this.date = date;
         }

         // Getters and Setters
         public String getWorkoutId() { return workoutId; }
         public void setWorkoutId(String workoutId) { this.workoutId = workoutId; }
         public String getUserId() { return userId; }
         public void setUserId(String userId) { this.userId = userId; }
         public String getType() { return type; }
         public void setType(String type) { this.type = type; }
         public int getDuration() { return duration; }
         public void setDuration(int duration) { this.duration = duration; }
         public LocalDateTime getDate() { return date; }
         public void setDate(LocalDateTime date) { this.date = date; }
     }