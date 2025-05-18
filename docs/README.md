# Real-Time Fitness Tracker
## Introduction
The Real-Time Fitness Tracker is a mobile application designed to monitor workouts, heart rate, and calorie burn in real time, helping users achieve their fitness goals.

## Links
- [System Specification](SPECIFICATION.md)
- [Architecture Diagrams](ARCHITECTURE.md)
- [Stakeholder Analysis](STAKEHOLDER_ANALYSIS.md)
- [System Requirements](SYSTEM_REQUIREMENTS.md)
- [Use Cases and Tests](USE_CASES_AND_TESTS.md)
- [Agile Planning](AGILE_PLANNING.md)
- [Reflection](REFLECTION.md)

- ## Assignment 7: Custom Kanban Board
- **Template**: Adapted "Automated Kanban" using the new Projects "Board" layout (classic templates unavailable post-August 2024 sunset).
- **Custom Columns**: Added "Testing" for QA validation (e.g., T-010 accuracy checks) and "Blocked" for stalled tasks (e.g., API delays).
- **Tasks**: Linked Sprint 1 Issues from Assignment 6: US-001 (heart rate tracking), US-002 (calorie calculation), US-003 (start/stop workouts), US-007 (goal setting), US-012 (data accuracy).
- **Automation**: Implemented via `.github/workflows/kanban-automation.yml` with a Personal Access Token (PAT), moving Issues based on events:
  - `opened` → "To Do"
  - `closed` → "Done"
  - `in-progress` → "In Progress"
  - `testing` → "Testing"
  - `blocked` → "Blocked"
- **Screenshot**: [Kanban Board]
- ![image](https://github.com/user-attachments/assets/a132b681-d07a-4e10-91d1-3d6c62233816)

## Assignment 8: Dynamic Modeling
- **[State Transition Diagrams (Objects 1-7)](state_transition_diagrams.md)**:
  - Workout Session: FR-003, US-003, T-003 (start/stop).
  - Heart Rate Data: FR-001, US-001, T-001 (real-time tracking).
  - Calorie Data: FR-002, US-002, T-002 (calorie calculation).
  - Fitness Goal: FR-007, US-007, T-007 (goal setting).
  - User Account: FR-001 (implied user data).
  - Device Connection: FR-012, US-012, T-012 (accurate data).
  - Activity Log: FR-004 (history logging).
- **[Activity Diagrams (Workflows 1-8)](activity_diagrams.md)**:
  - Start Workout: FR-003, US-003, T-003.
  - Track Heart Rate: FR-001, US-001, T-001.
  - Calculate Calories: FR-002, US-002, T-002.
  - Set Fitness Goal: FR-007, US-007, T-007.
  - User Registration: FR-001 (implied).
  - Sync Device: FR-012, US-012, T-012.
  - Save Workout Log: FR-004.
  - Pause Workout: FR-003, US-003 (extension).
- [Reflection](assignment8_reflection.md): Lessons learned from state and activity modeling challenges.

## Assignment 9: Domain Modeling and Class Diagram
- [Domain Model](domin_model.md)
- [Class Diagram (UML)](class_diagrams.md)
- [Reflection](assignment9_reflection.md)

- ## Assignment 10: From Class Diagrams to Code
- **Language Choice**: Java, chosen for familiarity (used in Assignment 9’s reference code) and strong support for object-oriented design, aligning with UML relationships.
- **Design Decisions**: Implemented all classes from Assignment 9’s class diagram in /src. Used composition for Workout-to-HeartRate/Calorie (1-to-1) and aggregation for Log-to-Workout (1-to-1..*). Getters ensure encapsulation.
- [Source Code](/src)

- - **Creational Patterns** (/creational_patterns):
  - Simple Factory: WorkoutFactory creates Cardio/Strength workouts for flexible session types (US-003).
  - Factory Method: DataProcessorFactory delegates HeartRate/Calorie processing (US-001, US-002).
  - Abstract Factory: UIFactory builds Mobile/Web UI components for platform-specific displays.
  - Builder: GoalBuilder constructs Goals with optional attributes (US-007).
  - Prototype: HeartRate cloning avoids redundant initialization (US-001).
  - Singleton: DatabaseConnection ensures one DB instance (FR-004).
 
  - ## Assignment 10: From Class Diagrams to Code
- **Language**: Java (familiar, supports OOP).
- **Design**: Classes in /src match Assignment 9 UML. Composition for Workout-to-HeartRate/Calorie, aggregation for Log-to-Workout.
- **Patterns** (/creational_patterns): Simple Factory (Workout types), Factory Method (Data processing), Abstract Factory (UI), Builder (Goal), Prototype (HeartRate), Singleton (DB).
- [Source Code](/src)
- [Creational Patterns](/creational_patterns)
- [Tests](/tests)
- [Changelog](CHANGELOG.md)

- ## Assignment 11: Persistence Repository Layer
- **Task 1: Repository Interfaces** (/repositories):
  - Used generics in `Repository<T, ID>` to avoid code duplication across entities (User, Workout).
  - Defined `UserRepository` and `WorkoutRepository` for specific CRUD operations, extensible for future methods (e.g., findByEmail).
 
  - - **Task 3: Storage Abstraction** (/factories):
  - Chose Factory Pattern over DI for simplicity in creating repository instances (e.g., InMemoryUserRepository).
  - RepositoryFactory supports switching storage types (MEMORY, DATABASE), ensuring decoupling.
# RealTimeFitnessTracker

**RealTimeFitnessTracker** is a web/mobile app for tracking fitness metrics like steps, heart rate, and workouts in real-time.

## Getting Started
1. Clone the repo: `git clone https://github.com/your-username/RealTimeFitnessTracker.git`
2. Install frontend dependencies: `cd frontend && npm install`
3. Install backend dependencies: `cd backend && pip install -r requirements.txt`
4. Run the app: `npm run start` (frontend) and `python manage.py runserver` (backend)

## Features for Contribution
| Feature | Issue | Status |
|---------|-------|--------|
| Add calories calculation | [#20](https://github.com/your-username/RealTimeFitnessTracker/issues/20) | Open |
| Fix step counter alignment | [#18](https://github.com/your-username/RealTimeFitnessTracker/issues/18) | Open |
| Write tests for heart rate API | [#15](https://github.com/your-username/RealTimeFitnessTracker/issues/15) | Open |

See [CONTRIBUTING.md](CONTRIBUTING.md) for details on how to contribute.
