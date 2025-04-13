# assignment9_reflection.md

## Reflection on Domain Modeling and Class Diagram Development

Creating the domain model and class diagram for the Real-Time Fitness Tracker was a deep dive into structuring a system. One challenge was abstraction—deciding entities like Workout vs. a vague “Session” took revisiting Assignment 6’s US-003 (start/stop workouts). Relationships were tough; I initially saw HeartRate as independent but realized it’s tied to Workout (Assignment 8’s state diagram helped clarify this). Defining methods like `pause()` for Workout felt ambiguous—should it change state or trigger logic? Mapping to Assignment 8’s “Paused” state settled it.

The class diagram aligns tightly with prior work. User supports FR-001 (user-specific data) and Assignment 5’s login use case. Workout’s `start()` and `stop()` reflect US-003 and Assignment 8’s activity diagram. HeartRate and Calorie match FR-001, FR-002, and US-001, US-002, with states like “Tracking” from Assignment 8. Goal ties to US-007’s workflow, and Log fulfills FR-004’s logging, as seen in “Save Workout Log.” Device aligns with US-012’s sync, per Assignment 8. These links ensure sprint tasks (e.g., T-001 for heart rate) are code-ready.

Trade-offs shaped the design. I used composition for Workout-to-HeartRate/Calorie (1-to-1) since they’re inseparable, unlike Log-to-Workout’s aggregation (1-to-1..*), where Workouts stand alone (FR-004). I skipped inheritance for HeartRate and Calorie to avoid a “Data” superclass—FR-001 and FR-002’s unique needs didn’t justify it, though it limits reuse. Capping Goals at 5 (FR-007) simplifies but may restrict users later. Exploring Java code alongside Mermaid.js was insightful—Java clarified implementation (e.g., `List<Workout>` for User), but Mermaid’s visual relationships (1..*) were clearer for UML compliance.

Lessons learned were profound. Domain modeling prioritizes core entities—User and Workout stood out, while Device was secondary but critical (FR-012). UML diagrams bridge requirements to code; `start()` and `record()` suggest clear methods. Iteration refined my model, aligning with Assignment 6’s Agile stories. Mermaid.js is great but finicky—splitting files in Assignment 8 taught me to test rendering early. Java code helped me see encapsulation (e.g., HeartRate’s `bpm`) and relationships as fields, but UML’s visual clarity won for design. This process showed me how object-oriented design turns ideas into systems, ready for coding.

(510 words)
