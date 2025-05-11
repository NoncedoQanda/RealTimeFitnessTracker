# REFLECTION.md
## Challenges in Balancing Stakeholder Needs

1. **Real-Time vs. Scalability**: Cloud providers want scalable servers for 10,000 users, whereas fitness enthusiasts desire real-time data (1-second updates). This necessitated putting effective data processing ahead of feature bloat.
The requirement for encryption and multi-factor authentication (MFA) by healthcare professionals may irritate enthusiasts who desire speedy access. I countered this by making MFA optional for non-medical users.
3. **Integration Complexity**: While developers encounter compatibility issues, trainers and device manufacturers require API support. To keep it manageable, I restricted integrations to well-known APIs (like Google Fit).
