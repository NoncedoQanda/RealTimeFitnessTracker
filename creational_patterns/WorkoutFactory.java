package com.fitness.tracker.patterns;

public class WorkoutFactory {
    public Workout createWorkout(String type, String workoutId) {
        switch (type.toLowerCase()) {
            case "cardio": return new CardioWorkout(workoutId);
            case "strength": return new StrengthWorkout(workoutId);
            default: throw new IllegalArgumentException("Unknown workout type");
        }
    }
}

class CardioWorkout extends Workout {
    public CardioWorkout(String workoutId) { super(workoutId); }
}

class StrengthWorkout extends Workout {
    public StrengthWorkout(String workoutId) { super(workoutId); }
}
