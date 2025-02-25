# ARCHITECTURE.md
## Real-Time Fitness Tracker
### Domain
Health & Fitness – A system for monitoring physical activity in real time.
### Problem Statement
Provide immediate feedback on workouts to improve training efficiency.
### Individual Scope
Feasible using mobile sensors and a lightweight backend.
## Context Diagram
The Real-Time Fitness Tracker allows users to monitor their fitness data and syncs with a cloud service for storage and analysis.
```mermaid
graph TD
    A[User] -->|Uses| B(Real-Time Fitness Tracker)
    B -->|Syncs with| C[Cloud Service]
    B -->|Integrates| D[External Fitness API]
graph TD
    A[User] -->|Interacts with| B[Mobile App]
    B -->|Reads| C[Mobile Device Sensors]
    B -->|Sends data to| D[Backend API]
    D -->|Stores/Retrieves| E[Database]
    D -->|Queries| F[External Fitness API]
graph TD
    A[User] -->|Interacts with| B[UI Layer]
    B -->|Calls| C[Data Processor]
    C -->|Fetches data from| D[Sensor Interface]
    D -->|Reads| E[Mobile Device Sensors]
    C -->|Sends to| F[Backend API]
