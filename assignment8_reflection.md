# assignment8_reflection.md

## Challenges
- **Granularity**: Picking states like "Paused" for Workout Session was tricky—too many states (e.g., "Paused," "Resumed") cluttered the diagram, but too few (just "Active") lost detail needed for FR-003. For workflows, balancing actions like "Validate input" vs. broader steps was hard to keep readable.
- **Agile Alignment**: Matching state diagrams to user stories (e.g., US-001’s "Tracking" state) required breaking tasks like T-001 into clear transitions, which felt forced at times since Agile focuses on deliverables, not object states.

## State vs. Activity Diagrams
- **State Diagrams**: Showed how objects like "Heart Rate Data" change (Untracked → Tracking), great for understanding lifecycles but rigid for processes. They tied well to FR-001’s tracking need.
- **Activity Diagrams**: Mapped workflows like "Track Heart Rate" with decisions (e.g., device connected?), making user actions clearer but less focused on object states. They better suited stakeholder needs, such as real-time updates.

## Lessons Learned
Splitting diagrams into multiple files fixed GitHub’s rendering issue—a practical workaround I’ll reuse. State diagrams helped design object behavior, while activity diagrams clarified user-system interactions, both essential for implementation.
