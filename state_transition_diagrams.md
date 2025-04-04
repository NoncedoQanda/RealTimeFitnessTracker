# state_transition_diagrams.md

## 1. Workout Session
```mermaid
stateDiagram-v2
    [*] --> Inactive: App launched
    Inactive --> Active: User starts workout
    Active --> Paused: User pauses workout
    Paused --> Active: User resumes workout
    Active --> Inactive: User stops workout [Duration > 0]
    Inactive --> [*]: Workout saved
```

**Explanation:** The "Workout Session" object starts as "Inactive" when the app launches. It transitions to "Active" when the user starts a workout (US-003, FR-003: Start/stop functionality). "Paused" allows temporary breaks, and stopping (with a guard condition ensuring duration) returns it to "Inactive" before saving, aligning with FR-004 (log activities).


## 2. Heart Rate Data
```mermaid
stateDiagram-v2
    [*] --> Untracked: No device connected
    Untracked --> Tracking: Device synced
    Tracking --> Untracked: Device disconnected
    Tracking --> Recorded: Workout ends
    Recorded --> [*]: Data saved
```

**Explanation:** "Heart Rate Data" begins "Untracked" until a device syncs (US-001, FR-001: Real-time tracking). It transitions to "Tracking" during a workout and to "Recorded" when it ends, saving data (FR-004), supporting accurate monitoring.

## 3. Calorie Data
```mermaid
stateDiagram-v2
    [*] --> Idle: No workout
    Idle --> Calculating: Workout starts
    Calculating --> Updated: Data processed
    Updated --> Idle: Workout ends
    Updated --> [*]: Data logged [Calories > 0]
```

**Explanation:** "Calorie Data" is "Idle" until a workout begins (US-002, FR-002: Calculate calories). It calculates in real-time, updates, and logs when the workout ends, ensuring FR-004 (activity logging).

## 4. Fitness Goal
```mermaid
stateDiagram-v2
    [*] --> Draft: User sets goal
    Draft --> Active: Goal confirmed
    Active --> Achieved: Target met
    Active --> Expired: Deadline passed
    Achieved --> [*]: Goal archived
    Expired --> [*]: Goal archived
```

**Explanation:** "Fitness Goal" starts as "Draft" (US-007, FR-007: Set goals), becomes "Active" when set, and ends as "Achieved" or "Expired," aligning with goal-tracking requirements.

## 5. User Account
```mermaid
stateDiagram-v2
    [*] --> Unregistered: App opened
    Unregistered --> Registered: User signs up
    Registered --> LoggedIn: User logs in
    LoggedIn --> LoggedOut: User logs out
    LoggedOut --> LoggedIn: User logs in again
    LoggedIn --> [*]: Account deleted
```
**Explanation:** "User Account" supports registration and login (implied in FR-001 for user-specific data), transitioning between states for access control.

## 6. Device Connection
```mermaid
stateDiagram-v2
    [*] --> Disconnected: App launched
    Disconnected --> Connecting: User initiates sync
    Connecting --> Connected: Sync successful
    Connected --> Disconnected: Sync fails [Timeout]
    Connected --> [*]: Workout ends
```

**Explanation:** "Device Connection" ensures accurate data (US-012, FR-012), moving to "Connected" only on a successful sync, with a timeout guard.

## 7. Activity Log
```mermaid
stateDiagram-v2
    [*] --> Empty: No workouts
    Empty --> Pending: Workout ends
    Pending --> Saved: Data processed
    Saved --> [*]: Log accessed
```

**Explanation:** The "Activity Log" tracks history (FR-004), transitioning from "Empty" to "Saved" as workouts are completed.


