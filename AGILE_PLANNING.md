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
