# REFLECTION.md
## Challenges in Balancing Stakeholder Needs

1. **Real-Time vs. Scalability**: Fitness Enthusiasts want instant data (1-second updates), but Cloud Providers need scalable servers for 10,000 users. This required prioritizing efficient data processing over feature bloat.
2. **Security vs. Usability**: Healthcare Professionals demand encryption and MFA, which could frustrate Enthusiasts wanting quick access. I balanced this with optional MFA for non-medical users.
3. **Integration Complexity**: Trainers and Device Manufacturers need API support, but Developers face compatibility challenges. I limited integrations to major APIs (e.g., Google Fit) to keep it manageable.
