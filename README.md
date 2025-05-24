# budgeting-app
This repository will include my budgeting app. I plan to complete this in a few phases:

- [ ] ##Phase 1: Foundation 

Goal: Get a working backend + UI skeleton.

    🔹 Spring Boot Setup

        Learn: Controllers, Services, Repositories.

        Resource: Spring Boot Beginner Guide

    🔹 MySQL Setup

        Use a local MySQL database.

        Resource: MySQL Workbench + Spring Boot Setup

    🔹 Basic Features

        Create endpoints for:

            Registering transactions (/transactions)

            Viewing categorized expenses and income (/summary)

        Learn: DTOs and validation with Spring Boot.

    🔹 Simple HTML/CSS Frontend

        Bootstrap or Tailwind CSS for UI speed.

        Just enough to input transactions and view summaries.

✅ Phase 2: Dashboards & Charts (1 week)

Goal: Visual feedback with charts.

    🔹 Frontend Charting

        Use Chart.js or Recharts (if using React).

        Show:

            Income vs Expenses (bar/pie)

            Spending over time (line graph)

    🔹 Backend Aggregation

        Write queries for monthly/weekly income & expenses.

        Resource: Spring Boot Projections and DTOs

✅ Phase 3: OAuth Implementation (2 weeks)

Goal: Build your own OAuth from scratch.

    🔹 Learn the flow:

        Resource: OAuth 2.0 Simplified (aaronparecki.com)

    🔹 Implement:

        Login → Token → Protected routes

        Use Spring Security for basic support but write the token logic yourself.

        Resource: Baeldung’s OAuth 2 Guide

✅ Phase 4: Auto Transaction Import (2 weeks)

Goal: Integrate API for real-time bank transactions.

    🔹 Choose API

        Plaid: Best for direct access to real bank transaction data.

            Plaid Docs

        Stripe: Better for tracking payments you send/receive, not personal expenses.

            Stripe Docs

        Suggested: Start with Plaid’s Sandbox.

    🔹 Set up integration

        Use OAuth/token-based login via Plaid Link.

        Fetch transaction data & auto-categorize.
