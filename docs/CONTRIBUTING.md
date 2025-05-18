# Contributing to RealTimeFitnessTracker

Thank you for contributing to **RealTimeFitnessTracker**, a real-time fitness tracking app! Follow these steps to get started.

## Setup
- **Prerequisites**: Install Node.js v18+, npm, and Git. For backend, install Python 3.10+ and pip.
- **Installation**:
  1. Fork this repository.
  2. Clone your fork: `git clone https://github.com/your-username/RealTimeFitnessTracker.git`
  3. Install frontend dependencies: `cd frontend && npm install`
  4. Install backend dependencies: `cd backend && pip install -r requirements.txt`
  5. Start the app: `npm run start` (frontend) and `python manage.py runserver` (backend)

## Coding Standards
- Run ESLint for JavaScript: `npm run lint`.
- Write unit tests using Jest: `npm test`.
- Ensure test coverage >80%.
- For Python, follow PEP8 and use Flake8: `flake8 .`.

## How to Contribute
1. Pick an issue labeled `good-first-issue` (e.g., UI fixes or test cases).
2. Comment on the issue to claim it.
3. Create a branch: `git checkout -b feature/issue-number`
4. Write code and tests.
5. Commit with a clear message: `git commit -m "Fix #issue-number: added heart rate display"`
6. Push to your fork: `git push origin feature/issue-number`
7. Submit a PR with a description:
