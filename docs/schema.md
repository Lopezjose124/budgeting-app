Schema Documentation Outline

# 1. 🎯 Purpose

In erd-v1.pdf you will find the current vesion of the Schema. The purpose of the database is to store users, accounts, transactions, and categories.

# 2. 🧱 Database Tables

## 🧑 Users Table

Stores user credentials and profile data.
| Column Name | Data Type | Constraints | Description |
| ------------ | ------------ | ---------------------------- | ------------------------------- |
| `id` | INT UNSIGNED | PRIMARY KEY, AUTO_INCREMENT | Unique identifier for each user |
| `username` | VARCHAR(50) | NOT NULL, UNIQUE | Login/display name |
| `name` | VARCHAR(50) | NOT NULL | Name of account holder |
| `email` | VARCHAR(100) | NOT NULL, UNIQUE | User email address |
| `password` | VARCHAR(255) | NOT NULL | Encrypted password |
| `created_at` | DATETIME | DEFAULT CURRENT_TIMESTAMP | Account creation time |

## 💰 Accounts Table

    Stores all the information relevant to the account

| Column Name | Data Type                                              | Constraints                      | Description           |
| ----------- | ------------------------------------------------------ | -------------------------------- | --------------------- |
| id          | INT UNSIGNED                                           | PRIMARY KEY, AUTO_INCREMENT      | Unique account ID     |
| user_id     | INT UNSIGNED                                           | FOREIGN KEY REFERENCES Users(id) | Links account to user |
| name        | VARCHAR(100)                                           | NOT NULL                         | Account Name          |
| type        | ENUM('checking', 'savings', 'credit', 'cash', 'other') | NOT NULL                         | Account type          |
| balance     | DECIMAL(10,2)                                          | DEFAULT 0.00                     | Initial/crrnt balance |
| created_at  | DATETIME                                               | DEFAULT CURRENT_TIMESTAMP        | Creation Timestamp    |

## 🗂️ Categories Table

    Defines income/expense categories for transaction grouping.

| Column Name | Data Type            | Constraints                      | Description                          |
| ----------- | -------------------- | -------------------------------- | ------------------------------------ |
| id          | INT UNSIGNED         | PRIMARY KEY, AUTO_INCREMENT      | Unique category ID                   |
| user_id     | INT UNSIGNED         | FOREIGN KEY REFERENCES Users(id) | Owner of the category                |
| name        | VARCHAR(100)         | NOT NULL                         | Category name (e.g. Rent, Groceries) |
| type        | ENUM(income/expense) | NOT NULL                         | Type of category                     |

## 💰 Transactions Table

Stores all relevant information pertaining each transaction made
| Column Name | Data Type | Constraints | Description |
|------------------|---------------|---------------------------------------|------------------------------------|
| id | INT UNSIGNED | PRIMARY KEY, AUTO_INCREMENT | Unique transaction ID |
| user_id | INT UNSIGNED | FOREIGN KEY REFERENCES Users(id) | Owner of transaction (for queries) |
| account_id | INT UNSIGNED | FOREIGN KEY REFERENCES Accounts(id) | Which account was used |
| category_id | INT UNSIGNED | FOREIGN KEY REFERENCES Categories(id) | Category of transaction |
| amount | DECIMAL(10,2) | NOT NULL | Positive or negative amount |
| description | VARCHAR(255) | | Optional description or notes |
| transaction_date | DATE | NOT NULL | When transaction occurred |
| created_at | DATETIME | DEFAULT CURRENT_TIMESTAMP | When transaction was logged |

## 📦 Budgets Table

    Tracks spending limits by category and period.

| Column Name | Data Type      | Constraints                             | Description                       |
| ----------- | -------------- | --------------------------------------- | --------------------------------- |
| id          | INT UNSIGNED   | PRIMARY KEY, AUTO_INCREMENT             | Unique identifier for each budget |
| user_id     | INT UNSIGNED   | NOT NULL, FOREIGN KEY -> users(id)      | The user this budget belongs to   |
| category_id | INT UNSIGNED   | NOT NULL, FOREIGN KEY -> categories(id) | The category this budget is for   |
| amount      | DECIMAL(10, 2) | NOT NULL                                | Budgeted amount for the category  |
| start_date  | DATE           | NOT NULL                                | Start of the budgeting period     |
| end_date    | DATE           | NOT NULL                                | End of the budgeting period       |
| created_at  | DATETIME       | DEFAULT CURRENT_TIMESTAMP               | Timestamp of creation             |

# 3. 🔗 Relationships

Users ↔ Transactions: One-to-many

Categories ↔ Transactions: One-to-many

Users ↔ Budgets: One-to-many

# 4. 📌 Notes & Assumptions

Currency format: e.g., USD stored as decimal(10, 2)
