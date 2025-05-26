# 💸 Budgeting App

A personal finance app that helps users track income, expenses, and budgets. Designed with simplicity, flexibility, and full control in mind. This project is part of a learning journey, using modern tools and a self-built OAuth system.

---

## 📷 Screenshot

> _TODO: Add screenshot or demo GIF once dashboard is functional._

---

## 🚀 Features

- Track income and expenses across multiple accounts
- Categorize transactions
- Visual dashboard with income vs. expense charts
- Budget limits and time-bound spending goals
- Automatic transaction import using a financial API (Plaid or Stripe)
- Self-hosted custom OAuth implementation for authentication
- Mobile-responsive interface _(planned)_

---

## 🛠 Tech Stack

**Backend:**

- Java 17+
- Spring Boot
- MySQL

**Frontend:**

- HTML, CSS, JS (vanilla for now)

**Tools:**

- Git + GitHub
- Trello/ Notion (planning)
- ERD tools (Canva)

---

## 📦 Folder Structure

```

/backend           # Spring Boot application
└── src
/frontend          # Static frontend files (HTML, CSS, JS)
/docs              # Documentation (e.g., schema.md, ERD diagrams)
.gitignore
README.md

```

---

## 🗂️ Database

The database is designed to store users, transactions, accounts, budgets, and categories.

See [`schema.md`](docs/schema.md) for the full schema and table definitions.

**ERD:**  
See [`erd-v1.pdf`](docs/erd-v1.pdf)

> _TODO: Add SQL seed/migration instructions_

---

## 🧪 Setup Instructions

### ✅ Prerequisites

- Java 17+
- MySQL Server
- Maven or Gradle
- Git

### 🛠 Steps

```
# Clone the repo
git clone git@github.com:Lopezjose124/budgeting-app.git
cd budgeting-app

# Navigate to backend and run Spring Boot
cd backend
# TODO: Add how to start Spring Boot (e.g., ./mvnw spring-boot:run or IntelliJ config)

# Set up MySQL Database
# TODO: Include DB setup and config instructions
```

---

## 🌳 Git Workflow

This project follows a clean Git flow:

- `main`: Stable, production-ready code
- `dev`: Active development base
- `feature/*`: Individual branches for new features
- `docs/*`: Documentation-specific updates

```

# Create new feature branch
git checkout -b feature/some-feature

# Add, commit, and push changes
git add .
git commit -m "feat: short message here"
git push origin feature/some-feature

# Open pull request into `dev` when ready
```

See `.gitignore` for ignored files and folders.

---

## 💡 Future Enhancements

> _TODO: Track improvements as the project evolves._

- Budget alerts and notifications
- Export to CSV or PDF
- Mobile-friendly version
- CI/CD pipeline with GitHub Actions

---

## 🙋‍♂️ Author

**Jose J Lopez Ayala**
[GitHub](https://github.com/Lopezjose124)

---
