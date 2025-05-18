# REFLECTION.md
## Challenges in Balancing Stakeholder Needs for Real-Time Fitness Tracker

1. **Real-Time Data vs. Scalability**:  
   - *Challenge*: Fitness Enthusiasts demand instant data updates (1-second latency), but Cloud Service Providers need scalable infrastructure for 10,000 users during peak times.  
   - *Resolution*: Prioritized efficient data processing (e.g., lightweight sync in FR4) over adding complex features, ensuring scalability (NFR5).

2. **Security vs. Usability**:  
   - *Challenge*: Healthcare Professionals require encryption (NFR6) and MFA (NFR7), which could frustrate Fitness Enthusiasts wanting quick access (NFR2).  
   - *Resolution*: Made MFA optional for non-medical users, balancing security with ease of use.

3. **Integration Complexity**:  
   - *Challenge*: Personal Trainers and Fitness Device Manufacturers need API integration (FR6), but App Developers face compatibility issues across devices.  
   - *Resolution*: Limited integrations to major APIs (e.g., Google Fit), keeping development feasible (NFR4).
# Reflection on Assignment 14: RealTimeFitnessTracker

Preparing **RealTimeFitnessTracker** for open-source collaboration was both challenging and rewarding. Peer feedback helped me improve my repository significantly. For instance, a classmate pointed out that my `CONTRIBUTING.md` lacked instructions for running tests, so I added a section explaining how to use `npm test` for Jest. Another peer suggested my `good-first-issue` descriptions were too technical, so I simplified tasks like “Fix step counter alignment” to include step-by-step CSS changes.

Onboarding contributors presented several challenges. Writing beginner-friendly issues for a fitness tracker was difficult because features like heart rate visualization required understanding APIs. I had to break tasks into smaller steps, like “Add a loading spinner for API calls,” to make them accessible. Additionally, ensuring my setup instructions worked across platforms (e.g., Windows and macOS) required testing on multiple machines, which was time-consuming. Promoting my repo in the class WhatsApp group also felt awkward initially, but I learned to pitch it concisely: “A fitness app needing UI and API contributions.”

This assignment taught me valuable lessons about open-source collaboration. Clear documentation, like a detailed `README.md` and `CONTRIBUTING.md`, is essential for lowering the barrier to entry. I also realized that engaging with peers’ repositories by starring and forking builds a collaborative community, which increased my own repo’s visibility. Finally, GitHub forks, especially, reflect a project’s potential, as they show contributors are willing to invest time in it.
