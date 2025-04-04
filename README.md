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

- ## Assignment 8: Dynamic Modeling
- [State Transition Diagrams](state_transition_diagrams.md) - Maps to FR-001, FR-003, US-001, Sprint 1 tasks (T-001).
- [Activity Diagrams](activity_diagrams.md) - Aligns with FR-004, US-003, stakeholder needs.




