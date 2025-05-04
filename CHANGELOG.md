# CHANGELOG.md

## [Assignment 10] - 2025-04-18
- Added /src with User, Workout, HeartRate, Calorie, Goal, Device, Log classes.
- Implemented 6 creational patterns in /creational_patterns.
- Added unit tests in /tests with ~93% coverage.
- Created issues #15-#20 for pattern tasks and bugs.
- Moved completed tasks to Done on Sprint 1 Kanban.

- ## [Assignment 11] - 2025-04-22
- Added /repositories with Repository, UserRepository, WorkoutRepository interfaces (#36-#38).
- Implemented InMemoryUserRepository, InMemoryWorkoutRepository in /repositories/inmemory (#40-#41).
- Added unit tests for in-memory repositories in /tests (#42).
- Created RepositoryFactory in /factories for storage abstraction (#43).
- Added DatabaseUserRepository stub and updated class_diagram.md (#44-#45).
- Documented in README.md (#39).
- Created issues #36-#45, moved to Done on Sprint 1 Kanban.

## [Assignment 12] - 2025-05-04
- Fixed path not found error and cloned repo (#62).
- Installed Maven and fixed PATH error (#63, #64).
- Fixed JAVA_HOME error for Maven (#66).
- Fixed terminal error for file creation (#73).
- Resolved directory confusion for RealTimeFitnessTracker-1 (#85, #111).
- Cleaned up untracked files and nested directory (#91).
- Fixed JAVA_HOME for JDK 24 (#97, #112, #113).
- Created .mvn/jvm.config to suppress JDK 24 warnings (#79, #103).
- Resolved git push conflict by pulling remote changes (#104).
- Fixed non-parseable pom.xml and added FitnessTrackerApplication (#72, #105, #110).
- Fixed UserControllerTest.java compilation errors by moving to src/test/java and correcting syntax (#113).
- Implemented service layer with UserService, WorkoutService, GoalService (#114).
- Developed REST API for User, Workout, Goal (#115).
- Documented API with Swagger (#116).
- Updated GitHub issues and Kanban board (#117).
- Created issues #57-#117, moved to Done on Sprint 1 Kanban.
