# kanban_explanation.md

## What is a Kanban Board?
A Kanban board is a visual project management tool that helps track tasks by organizing them into columns representing different stages of a workflow, such as "To Do," "In Progress," and "Done." It makes it easy to see what needs to be done, what’s being worked on, and what’s finished, while also limiting the number of tasks in progress to keep work manageable and efficient.

## How Our Board Works
My "Sprint 1 Kanban" board, built for the Real-Time Fitness Tracker project, uses five columns to manage Sprint 1 tasks from Assignment 6: "To Do," "In Progress," "Done," "Testing," and "Blocked." Here’s how it functions:

- **Visualizes Workflow**: The columns show the progress of our five user stories (US-001, US-002, US-003, US-007, US-012). For example, US-001 ("Track heart rate in real time") starts in "To Do" when opened, moves to "In Progress" with the `in-progress` label, shifts to "Testing" with `testing` for QA checks (like T-010’s accuracy test), and lands in "Done" when closed. If an issue stalls (e.g., API delays in US-012), it’s labeled `blocked` and moves to "Blocked."

- **Limits Work-in-Progress (WIP)**: To avoid overwhelming the development process, I set an informal WIP limit of 3 tasks in the "In Progress" column. For instance, only tasks like T-001 (API connection), T-003 (calorie logic), and T-005 (start/stop button) can be active at once, ensuring focus and reducing bottlenecks.

- **Supports Agile Principles**: The board supports Agile by enabling continuous delivery and adaptability. The `kanban-automation.yml` workflow automates movements—e.g., closing an Issue moves it to "Done"—mimicking a smooth sprint cycle. Custom columns like "Testing" adapt to our QA needs, while "Blocked" highlights issues for quick resolution, keeping the project flexible and iterative.
