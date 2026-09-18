# System Architecture

## 1. Project Title

# Student Expense & Budget Management System

---

## 2. Architecture Overview

The Student Expense & Budget Management System follows a simple **layered architecture**.

The system is divided into different logical layers so that each part of the application has a specific responsibility.

The major layers are:

1. Presentation Layer
2. Management/Business Logic Layer
3. Validation Layer
4. Data Storage Layer

The overall architecture is:

```text
                    +----------------------+
                    |        USER          |
                    +----------+-----------+
                               |
                               v
                    +----------------------+
                    |    Main / Menu       |
                    |  Presentation Layer  |
                    +----------+-----------+
                               |
                               v
              +-----------------------------------+
              |       Management Layer            |
              |                                   |
              |  +-----------------------------+  |
              |  | ExpenseManager              |  |
              |  +-----------------------------+  |
              |                                   |
              |  +-----------------------------+  |
              |  | BudgetManager               |  |
              |  +-----------------------------+  |
              |                                   |
              |  +-----------------------------+  |
              |  | SearchManager               |  |
              |  +-----------------------------+  |
              |                                   |
              |  +-----------------------------+  |
              |  | ReportGenerator              |  |
              |  +-----------------------------+  |
              +----------------+------------------+
                               |
                               v
                    +----------------------+
                    |   InputValidator     |
                    |  Validation Layer    |
                    +----------+-----------+
                               |
                               v
                    +----------------------+
                    |     FileManager      |
                    |   Data Storage Layer  |
                    +----------+-----------+
                               |
                               v
             +--------------------------------------+
             |          Local Text Files             |
             |                                      |
             | users.txt                            |
             | expenses.txt                         |
             | budgets.txt                          |
             +--------------------------------------+