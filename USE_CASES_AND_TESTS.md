# USE_CASES_AND_TESTS.md
## Use Case Diagram for Real-Time Fitness Tracker

### Diagram
```mermaid
graph TD
    A[Fitness Enthusiast] --> UC1[Track Heart Rate]
    A --> UC2[Calculate Calories]
    A --> UC3[Start/Stop Workout]
    A --> UC4[Sync Data]
    A --> UC7[Set Goals]
    A --> UC8[Notify Goal Completion]
    B[Personal Trainer] --> UC5[Export Logs]
    C[App Developer] --> UC6[Integrate APIs]
    D[Cloud Service Provider] --> UC4
    E[Healthcare Professional] --> UC5
    F[Fitness Device] --> UC1
    F --> UC2
    UC1 --> UC2  %% Calculate Calories includes Track Heart Rate
    UC3 --> UC1  %% Start/Stop Workout triggers Track Heart Rate

### Explanation
- **Actors**:
  - *Fitness Enthusiast*: Primary user, tracks workouts and sets goals (FR1, FR7).
  - *Personal Trainer*: Exports logs to monitor clients (FR5 concern).
  - *App Developer*: Configures API integrations (FR6 concern).
  - *Cloud Service Provider*: Ensures data sync (FR4 concern).
  - *Healthcare Professional*: Uses logs for health insights (FR5 concern).
  - *Fitness Device*: Provides sensor data (FR1, FR2).
- **Relationships**:
  - "Calculate Calories" includes "Track Heart Rate" (needs heart rate data).
  - "Start/Stop Workout" triggers "Track Heart Rate."
- **Stakeholder Concerns**:
  - Fitness Enthusiast: Real-time feedback (UC1, UC8).
  - Personal Trainer: Data access (UC5).
  - Cloud Provider: Reliable sync (UC4).

## Use Case Specifications

### UC1: Track Heart Rate
- **Description**: Display user’s heart rate in real time during a workout.
- **Preconditions**: User is logged in, workout session is active, Fitness Device is connected.
- **Postconditions**: Heart rate is displayed and logged.
- **Basic Flow**:
  1. User starts workout (UC3).
  2. System requests heart rate from Fitness Device.
  3. System displays heart rate, updating every 1 second.
- **Alternative Flow**:
  - A1: If device disconnects, system prompts user to reconnect or use manual entry (FR9).

### UC2: Calculate Calories
- **Description**: Compute and display calories burned based on heart rate and activity.
- **Preconditions**: Heart rate is being tracked (UC1).
- **Postconditions**: Calories burned are displayed and logged.
- **Basic Flow**:
  1. System retrieves heart rate data (UC1).
  2. User selects activity type (e.g., running).
  3. System calculates calories using MET formula.
  4. System displays result.
- **Alternative Flow**:
  - A1: If activity type isn’t selected, system uses a default (e.g., walking).

[Add UC3 through UC8 similarly—see previous message for full text if needed]

## Test Cases

### Functional Test Cases
| Test Case ID | Requirement ID | Description | Steps | Expected Result | Actual Result | Status |
|--------------|----------------|-------------|-------|-----------------|---------------|--------|
| TC-001       | FR1            | Verify real-time heart rate display | 1. Start workout. 2. Check heart rate display. | Updates every 1 sec, 95% accurate | TBD | TBD |
| TC-002       | FR2            | Verify calorie calculation | 1. Track heart rate. 2. Select "Running." 3. Check calories. | Matches MET within 5% | TBD | TBD |
[Add TC-003 to TC-008—see previous message]

### Non-Functional Test Cases
| Test Case ID | Requirement ID | Description | Steps | Expected Result | Actual Result | Status |
|--------------|----------------|-------------|-------|-----------------|---------------|--------|
| TC-NF-001    | NFR8           | Verify performance under load | 1. Simulate 10,000 users tracking heart rate. 2. Measure update time. | Updates in 1 sec on 4G | TBD | TBD |
| TC-NF-002    | NFR6           | Verify data security | 1. Sync data. 2. Inspect transmission. | AES-256 encryption used | TBD | TBD |
