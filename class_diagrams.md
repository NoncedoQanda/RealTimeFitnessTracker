# class_diagram.md

## Class Diagram
```mermaid
classDiagram
    class User {
        -userId: String
        -name: String
        -email: String
        +login() void
        +logout() void
        +setGoal() void
    }
    class Workout {
        -workoutId: String
        -startTime: DateTime
        -endTime: DateTime
        -status: String
        +start() void
        +pause() void
        +stop() void
    }
    class HeartRate {
        -hrId: String
        -bpm: Integer
        -timestamp: DateTime
        +record() void
        +getBPM() Integer
    }
    class Calorie {
        -calId: String
        -value: Float
        -timestamp: DateTime
        +calculate() void
        +getValue() Float
    }
    class Goal {
        -goalId: String
        -target: Float
        -type: String
        -deadline: Date
        +setTarget() void
        +checkProgress() Float
    }
    class Device {
        -deviceId: String
        -status: String
        +connect() void
        +disconnect() void
    }
    class Log {
        -logId: String
        -date: Date
        +addWorkout() void
        +getHistory() List~Workout~
    }
    User "1" --> "0..*" Workout : has
    User "1" --> "0..5" Goal : sets
    Workout "1" *--> "1" HeartRate : contains
    Workout "1" *--> "1" Calorie : contains
    Device "1" --> "0..*" HeartRate : provides
    Log "1" o--> "1..*" Workout : contains
  ```

## **Design Decisions**

**Composition** (*-->): Workout contains HeartRate and Calorie (1-to-1), as they’re essential parts of a session (US-001, US-002, Assignment 8 state diagrams).

**Aggregation** (o-->): Log contains Workouts (1-to-1..*), as Workouts can exist before being logged (FR-004).

**Association** (-->): User has Workouts (1-to-0..*) and Goals (1-to-0..5, per business rule), aligning with FR-003, FR-007.

**Multiplicity**: Device to HeartRate (1-to-0..*) supports real-time data (FR-012, US-012).

# class_diagram.md

## Updated Class Diagram for Assignment 11
```mermaid
classDiagram
    class User {
        -userId: String
        -name: String
        -email: String
        +login() void
        +logout() void
        +setGoal() void
    }
    class Workout {
        -workoutId: String
        -startTime: DateTime
        -status: String
        +start() void
        +pause() void
    }
    class Repository~T,ID~ {
        +save(entity) void
        +findById(id) Optional~T~
        +findAll() List~T~
        +delete(id) void
    }
    class UserRepository {
        <<interface>>
    }
    class WorkoutRepository {
        <<interface>>
    }
    class InMemoryUserRepository {
        -storage: Map~String,User~
    }
    class InMemoryWorkoutRepository {
        -storage: Map~String,Workout~
    }
    class DatabaseUserRepository {
        // Stub for future DB
    }
    class RepositoryFactory {
        +getUserRepository(storageType) UserRepository
        +getWorkoutRepository(storageType) WorkoutRepository
    }
    UserRepository <|.. InMemoryUserRepository
    UserRepository <|.. DatabaseUserRepository
    WorkoutRepository <|.. InMemoryWorkoutRepository
    Repository~User,String~ <|.. UserRepository
    Repository~Workout,String~ <|.. WorkoutRepository
    RepositoryFactory --> UserRepository
    RepositoryFactory --> WorkoutRepository

**No Inheritance**: Avoided a “Data” superclass for HeartRate and Calorie to keep it simple, matching Assignment 8’s distinct states.

**Alignment**: Matches domain_model.md and Assignment 6 user stories (e.g., US-003 for Workout’s start()).
