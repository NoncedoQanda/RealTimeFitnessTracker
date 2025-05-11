# domain_model.md

## Domain Model for Real-Time Fitness Tracker

| Entity     | Attributes                     | Methods                     | Relationships                          |
|------------|--------------------------------|-----------------------------|----------------------------------------|
| User       | userId: String, name: String, email: String | login(), logout(), setGoal() | 1 User has 0..* Workouts, 0..5 Goals |
| Workout    | workoutId: String, startTime: DateTime, endTime: DateTime, status: String | start(), pause(), stop()   | 1 Workout contains 1 HeartRate, 1 Calorie; 1..* Workouts in 1 Log |
| HeartRate  | hrId: String, bpm: Integer, timestamp: DateTime | record(), getBPM()         | 1 HeartRate in 1 Workout; 1 Device provides 0..* HeartRates |
| Calorie    | calId: String, value: Float, timestamp: DateTime | calculate(), getValue()    | 1 Calorie in 1 Workout               |
| Goal       | goalId: String, target: Float, type: String, deadline: Date | setTarget(), checkProgress() | 0..5 Goals belong to 1 User         |
| Device     | deviceId: String, status: String | connect(), disconnect()    | 1 Device provides 0..* HeartRates    |
| Log        | logId: String, date: Date      | addWorkout(), getHistory() | 1 Log contains 1..* Workouts         |

## Business Rules
- Max 5 Goals per User (FR-007).
- Workout requires startTime for data (FR-003).
- HeartRate needs Device connection (FR-012).
- Logs store all Workouts (FR-004).
