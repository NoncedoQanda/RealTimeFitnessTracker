# activity_diagrams.md

## 1. Start Workout
```mermaid
flowchart TD
    A[Start] --> B{User logged in?}
    B -->|Yes| C[User presses Start]
    B -->|No| D[Prompt login] --> C
    C --> E[System records start time] --> F[End]
```

**Explanation:** This workflow ensures a logged-in user starts a workout (US-003), addressing the fitness enthusiast’s need for seamless tracking (FR-003).

## 2. Track Heart Rate
```mermaid
flowchart TD
    A[Start] --> B{Device connected?}
    B -->|Yes| C[Read heart rate] --> D[Display in real time]
    B -->|No| E[Notify user] --> F[End]
    D --> F[End]
```
**Explanation:** Real-time heart rate tracking (US-001, FR-001) meets the enthusiast’s monitoring needs, with a decision for connectivity.

## 3. Calculate Calories
```mermaid
flowchart TD
    A[Start] --> B[Collect activity data]
    B --> C[Calculate calories] --> D{Valid data?}
    D -->|Yes| E[Update UI] --> F[End]
    D -->|No| G[Retry calculation] --> C
 ```

**Explanation:** Calorie calculation (US-002, FR-002) ensures accurate feedback for users.

## 4. Set Fitness Goal
```mermaid
flowchart TD
    A[Start] --> B[/User enters goal/] --> C[Validate input]
    C --> D{Valid?}
    D -->|Yes| E[Save goal] --> F[End]
    D -->|No| G[Prompt correction] --> B
```

**Explanation:** Goal setting (US-007, FR-007) supports user motivation with validation.

## 5. User Registration
```mermaid
flowchart TD
    A[Start] --> B[/Enter credentials/] --> C[Check uniqueness]
    C --> D{Unique?}
    D -->|Yes| E[Create account] --> F[Send confirmation] --> G[End]
    D -->|No| H[Notify user] --> B
```

**Explanation:** Registration ensures user-specific data (FR-001), addressing scalability.

## 6. Sync Device
```mermaid
flowchart TD
    A[Start] --> B[Initiate sync] --> C{Connection successful?}
    C -->|Yes| D[Fetch data] --> E[End]
    C -->|No| F[Retry] --> C
```

**Explanation:** Device sync (US-012, FR-012) ensures data accuracy for the developer stakeholder.

## 7. Save Workout Log
```mermaid
flowchart TD
    A[Start] --> B[Workout ends]
    B --> C[Process data] --> D[Save to log]
    D --> E[Notify user] & F[Update stats]
    E --> G[End]
    F --> G[End]
```
**Explanation:** Logging (FR-004) meets the enthusiast’s history tracking need with parallel actions.

## 8. Pause Workout
```mermaid
flowchart TD
    A[Start] --> B[User presses Pause]
    B --> C[System halts tracking] --> D[End]
```

**Explanation:** Pausing (US-003) offers flexibility, addressing user control.
    
