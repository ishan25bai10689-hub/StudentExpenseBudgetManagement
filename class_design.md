# Class Design

## 1. Introduction

The Student Expense & Budget Management System follows an
Object-Oriented Programming approach.

The application is divided into multiple classes. Each class has a
specific responsibility, which makes the application modular,
maintainable, and easier to test.

---

# 2. Class Overview

The project will contain the following major classes:

| Class | Main Responsibility |
|---|---|
| Main | Starts the application |
| Menu | Handles the main menu |
| User | Represents student information |
| Expense | Represents an expense |
| Budget | Represents monthly budget |
| ExpenseManager | Manages expense operations |
| BudgetManager | Manages budget operations |
| FileManager | Handles file storage |
| SearchManager | Handles search, filtering and sorting |
| ReportGenerator | Generates expense reports |
| InputValidator | Validates user input |

---

# 3. Main Class

## Purpose

The Main class is the entry point of the application.

## Responsibilities

- Start the application.
- Create required objects.
- Start the menu.
- Control the initial application flow.

## Main Method

```java
public static void main(String[] args)