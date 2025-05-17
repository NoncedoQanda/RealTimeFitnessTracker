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
