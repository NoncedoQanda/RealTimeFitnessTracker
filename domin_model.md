# domain_model.md

## Domain Model for Real-Time Fitness Tracker

| Entity     | Attributes                     | Methods                     | Relationships                          |
|------------|--------------------------------|-----------------------------|----------------------------------------|
| User       | userId: String, name: String, email: String | login(), logout(), setGoal() | 1 User has 0..* Workouts, 0..* Goals |
| Workout    | workoutId: String, startTime: DateTime, endTime: DateTime, status: String | start(), pause(), stop()   | 1 Workout has 1 HeartRate, 1 Calorie; 1..* Workouts in 1 Log |
| HeartRate  | hrId: String, bpm: Integer, timestamp: DateTime | record(), getBPM()         | 1 HeartRate belongs to 1 Workout; 1 Device provides 0..* HeartRates |
| Calorie    | calId: String, value: Float, timestamp: DateTime | calculate(), getValue()    | 1 Calorie belongs to 1 Workout       |
| Goal       | goalId: String, target: Float, type: String, deadline: Date | setTarget(), checkProgress() | 0..* Goals belong to 1 User         |
| Device     | deviceId: String, status: String | connect(), disconnect()    | 1 Device provides 0..* HeartRates    |
| Log        | logId: String, date: Date      | addWorkout(), getHistory() | 1 Log contains 1..* Workouts         |

## Business Rules
- A User can have up to 5 active Goals at once (FR-007 constraint).
- A Workout must have a startTime before recording HeartRate or Calorie data (FR-003).
- HeartRate data is only valid if the Device is connected (FR-012).
- Logs store all completed Workouts indefinitely (FR-004).
