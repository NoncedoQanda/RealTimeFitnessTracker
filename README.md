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
