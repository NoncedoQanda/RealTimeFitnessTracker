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
Deliver core workout tracking, goal-setting, and device integration functionality for the Fitness Enthusiast to enable reliable real-time monitoring and motivation.

### Sprint Backlog

| Task ID | Task Description                | Assigned To | Estimated Hours | Status         | Acceptance Criteria                          |
|---------|---------------------------------|-------------|-----------------|----------------|---------------------------------------------|
| T-001   | Connect to Fitness Device API   | Alice       | 8               | To Do          | Successfully connects and retrieves data    |
| T-002   | Display heart rate UI           | Bob         | 6               | To Do          | Heart rate displayed in real-time           |
| T-003   | Implement calorie calculation logic | Carol   | 6               | To Do          | Calorie calculation matches MET within 5%   |
| T-004   | Design calorie display UI       | Alice       | 4               | To Do          | Calorie display integrated with UI          |
| T-005   | Add start/stop button           | Bob         | 4               | To Do          | Button starts/stops session, saves data     |
| T-006   | Save session data locally       | Carol       | 6               | To Do          | Session data saved accurately on stop       |
| T-007   | Create goal-setting form        | Alice       | 4               | To Do          | Form created and functional                 |
| T-008   | Validate and save goal          | Bob         | 4               | To Do          | Goals are validated and saved               |
| T-009   | Set up Fitness Device data stream | Carol     | 8               | To Do          | Data stream set up and operational          |
| T-010   | Test data accuracy (95% threshold) | Alice     | 4               | To Do          | Data accuracy meets 95% threshold           |

## Risk Management
| Risk ID | Risk Description                                   | Mitigation Plan                                        |
|---------|---------------------------------------------------|--------------------------------------------------------|
| R-001   | Delay in API integration                          | Allocate buffer time, prioritize critical APIs         |
| R-002   | Inaccurate heart rate data                        | Implement rigorous testing, use fallback mechanisms    |
| R-003   | Data sync issues                                  | Regular sync tests, robust error handling              |

## Sprint Review and Retrospective
- **Sprint Review**: Review completed tasks, demonstrate to stakeholders, gather feedback.
- **Retrospective**: Discuss what went well, what didn’t, and how to improve in the next sprint.

## Continuous Integration and Testing
- **CI Setup**: Implement a CI pipeline for automated builds and tests.
- **Automated Testing**: Write unit tests, integration tests, and end-to-end tests to ensure code quality and functionality.

## Reflection (500 Words)

Transitioning to Agile for the Real-Time Fitness Tracker was a rollercoaster of excitement and self-doubt. As the sole stakeholder, I wrestled with breaking down Assignment 4’s Feature Requirements (FRs) into user stories that were clear, actionable, and aligned with the Agile principles. It was critical to ensure that each user story encapsulated a piece of functionality that delivered value to the user, while being feasible to complete within a single sprint.

Estimating effort solo was daunting. Assigning 5 points to US-012 versus 2 to US-007 relied on gut feel—device APIs loomed larger than a simple form—but without a team, it was guesswork refined by past experience. I had to objectively assess the complexity and interdependencies of tasks, balancing them against the limited resources and time constraints typical of a solo project.

Continuity with Assignments 3-5 was a strength—FR1-FR8 mapped cleanly to stories, and Use Cases (UC1-UC8) reinforced Must-haves like US-012. The real challenge was resisting scope creep; US-011’s manual input was a tempting addition, but it risked diverting focus from core functionalities. Prioritizing user stories using the MoSCoW method helped maintain clarity on what was essential for the Minimum Viable Product (MVP).

Sprint planning was another area of learning. Setting a sprint goal to deliver core workout tracking, goal-setting, and device integration functionality was straightforward, but breaking it down into a detailed sprint backlog required careful thought. Each task had to be granular enough to track progress but substantial enough to avoid micromanagement. Assigning tasks to “Dev Team” initially seemed sufficient, but I quickly realized the importance of individual accountability. This led to specifying task assignments, ensuring clear ownership and responsibility.

Incorporating acceptance criteria for each task brought additional clarity, defining the “done” state and ensuring that each deliverable met the required standards. This practice also facilitated better testing and validation processes, crucial for maintaining the app’s reliability and user satisfaction.

Risk management was another critical aspect. Identifying potential risks, such as delays in API integration or data accuracy issues, and planning mitigation strategies helped in proactively addressing challenges. This not only ensured smoother project execution but also built resilience into the project plan.

The importance of regular review and retrospective meetings became apparent as the project progressed. These sessions provided valuable insights into what was working well and what needed improvement. By discussing successes and challenges openly, I could continuously refine processes, enhancing efficiency and effectiveness for future sprints.

Lastly, setting up continuous integration and testing was a game-changer. Implementing a CI pipeline for automated builds and tests ensured that code quality remained high and that any issues were identified and addressed promptly. Writing unit tests, integration tests, and end-to-end tests provided comprehensive coverage, ensuring that all functionalities worked as expected and reducing the risk of bugs and regressions.

In conclusion, transitioning to Agile for the Real-Time Fitness Tracker project was a significant learning experience. It required balancing detailed planning with flexibility, maintaining a user-centric focus, and continuously improving processes through feedback and reflection. Despite the challenges, the structured approach of Agile methodologies enabled the efficient delivery of a functional, reliable, and user-friendly fitness tracking application.
