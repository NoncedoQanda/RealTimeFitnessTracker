# AGILE_PLANNING.md
## User Stories

| Story ID | User Story                                              | Acceptance Criteria                                      | Priority |
|----------|--------------------------------------------------------|---------------------------------------------------------|----------|
| US-001   | As a Fitness Enthusiast, I want to track my heart rate in real time so that I can monitor my workout intensity. | Display updates every 1 sec, 95% accurate.             | High     |
| US-002   | As a Fitness Enthusiast, I want to calculate calories burned so that I can track my energy expenditure.         | Matches MET within 5%, updates with heart rate.        | High     |
| US-003   | As a Fitness Enthusiast, I want to start/stop workouts so that I can control my tracking sessions.             | Session starts/stops, data saved on stop.              | High     |
| US-004   | As a Fitness Enthusiast, I want to sync data to the cloud so that I can access it across devices.              | Syncs within 10 sec when connected.                    | Medium   |
| US-005   | As a Personal Trainer, I want to export workout logs so that I can analyze my client’s progress.               | CSV file generated, includes all session data.         | Medium   |
| US-006   | As an App Developer, I want to integrate external APIs so that users can share data with other fitness apps.   | Syncs with Google Fit, bidirectional data flow.        | Medium   |
| US-007   | As a Fitness Enthusiast, I want to set fitness goals so that I can stay motivated.                            | Goal saved, validated (e.g., positive values).         | High     |
| US-008   | As a Fitness Enthusiast, I want to be notified when I complete a goal so that I can celebrate my achievement.  | Notification within 2 sec of goal met.                 | Medium   |
| US-009   | As a Healthcare Professional, I want to access workout logs so that I can provide health advice.               | Logs available in CSV, secure access only.             | Low      |
| US-010   | As a Cloud Service Provider, I want data synced securely so that user privacy is maintained.                   | AES-256 encryption during sync.                        | High     |
| US-011   | As a Fitness Enthusiast, I want manual input for heart rate so that I can track without a device.              | Manual entry option if device disconnects.             | Low      |
| US-012   | As a Fitness Device, I want to provide accurate data so that the app functions reliably.                       | Data sent every 1 sec, 95% accuracy.                   | High     |

# AGILE_PLANNING.md
## Product Backlog

| Story ID | User Story                                              | Priority (MoSCoW) | Effort Estimate (Story Points) | Dependencies |
|----------|--------------------------------------------------------|-------------------|-------------------------------|--------------|
| US-001   | Track my heart rate in real time                       | Must-have         | 3                             | US-012       |
| US-002   | Calculate calories burned                              | Must-have         | 3                             | US-001       |
| US-003   | Start/stop workouts                                    | Must-have         | 2                             | None         |
| US-007   | Set fitness goals                                      | Must-have         | 2                             | None         |
| US-012   | Provide accurate data (Fitness Device)                 | Must-have         | 5                             | None         |
| US-010   | Sync data securely (Cloud Service Provider)            | Should-have       | 3                             | US-004       |
| US-004   | Sync data to the cloud                                 | Should-have       | 2                             | US-003       |
| US-008   | Notify when I complete a goal                          | Should-have       | 2                             | US-002, US-007 |
| US-005   | Export workout logs (Personal Trainer)                 | Could-have        | 3                             | US-004       |
| US-006   | Integrate external APIs                                | Could-have        | 5                             | US-004       |
| US-009   | Access workout logs (Healthcare Professional)          | Could-have        | 2                             | US-005       |
| US-011   | Manual input for heart rate                            | Won’t-have        | 1                             | None         |

### Prioritization Justification
- **Must-have**: Core tracking (US-001, US-002, US-003, US-012) and goal setting (US-007) are essential for the MVP, addressing Fitness Enthusiast’s primary needs (usability, real-time feedback).
- **Should-have**: Security (US-010), cloud sync (US-004), and notifications (US-008) enhance value but can wait beyond MVP.
- **Could-have**: Trainer/healthcare features (US-005, US-009) and API integration (US-006) are valuable but not critical initially.
- **Won’t-have**: Manual input (US-011) is low priority due to reliance on Fitness Device.

## Sprint 1 Planning (2 Weeks)
### Sprint Goal
Deliver core workout tracking and goal-setting functionality for the Fitness Enthusiast to enable real-time monitoring and motivation.

### Selected Stories
- US-001: Track heart rate in real time (Must-have, 3 points)
- US-002: Calculate calories burned (Must-have, 3 points)
- US-003: Start/stop workouts (Must-have, 2 points)
- US-007: Set fitness goals (Must-have, 2 points)
- US-012: Provide accurate data (Fitness Device) (Must-have, 5 points)

- ## Sprint 1 Planning (2 Weeks)

### Sprint Goal
Deliver core workout tracking, goal-setting, and device integration functionality for the Fitness Enthusiast to enable reliable real-time monitoring and motivation.

### Sprint Backlog
| Task ID | Task Description                | Assigned To | Estimated Hours | Status         |
|---------|---------------------------------|-------------|-----------------|----------------|
| T-001   | Connect to Fitness Device API   | Dev Team    | 8               | To Do          |
| T-002   | Display heart rate UI           | Dev Team    | 6               | To Do          |
| T-003   | Implement calorie calculation logic | Dev Team | 6               | To Do          |
| T-004   | Design calorie display UI       | Dev Team    | 4               | To Do          |
| T-005   | Add start/stop button           | Dev Team    | 4               | To Do          |
| T-006   | Save session data locally       | Dev Team    | 6               | To Do          |
| T-007   | Create goal-setting form        | Dev Team    | 4               | To Do          |
| T-008   | Validate and save goal          | Dev Team    | 4               | To Do          |
| T-009   | Set up Fitness Device data stream | Dev Team  | 8               | To Do          |
| T-010   | Test data accuracy (95% threshold) | Dev Team | 4              | To Do          |
