# template_analysis.md

## GitHub Project Templates Comparison

| Template           | Columns/Workflows                      | Automation Features                              | Agile Suitability                          |
|--------------------|----------------------------------------|-------------------------------------------------|--------------------------------------------|
| Basic Kanban       | To Do, In Progress, Done              | None                                            | Simple Agile workflows, no sprint automation |
| Automated Kanban   | To Do, In Progress, Done              | Auto-moves Issues/PRs (e.g., closed → Done)     | Sprint tracking, continuous delivery       |
| Bug Triage         | Needs Triage, Triaged, In Progress, Done | Auto-moves based on labels (e.g., bug triaged) | Bug-focused, less suited for features      |
| Team Planning      | Backlog, To Do, In Progress, Done     | Optional automation (e.g., status updates)      | Flexible for sprints and backlog management |

## Justification
I chose "Automated Kanban" for the Real-Time Fitness Tracker because it aligns with our Sprint 1 plan (Assignment 6), which includes 5 user stories (US-001, US-002, US-003, US-007, US-012) focused on core functionality. Its simple workflow (To Do, In Progress, Done) mirrors our task progression, while automation—moving closed Issues to "Done"—supports Agile’s continuous delivery by minimizing manual effort. "Basic Kanban" lacks this efficiency, "Bug Triage" is too bug-specific, and "Team Planning" adds unnecessary backlog complexity for our current scope.
