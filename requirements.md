# System Requirements

# 1. Functional Requirements

Functional requirements describe the operations and services that the
Student Expense & Budget Management System must provide to the user.

---

## FR-01: User Profile Management

The system shall allow the user to create and maintain a basic
student profile.

The profile may contain:

- Student name
- Student ID
- Monthly budget

The system shall allow the user to view the stored profile
information.

---

## FR-02: Add Expense

The system shall allow the user to add a new expense.

The user shall provide:

- Expense description
- Expense amount
- Expense category
- Expense date

After successful validation, the expense shall be stored in the
system.

Example categories:

- Food
- Transport
- Education
- Shopping
- Entertainment
- Health
- Other

---

## FR-03: View Expenses

The system shall allow the user to view all stored expenses.

Each expense record should display:

- Expense ID
- Description
- Amount
- Category
- Date

---

## FR-04: Update Expense

The system shall allow the user to modify an existing expense.

The user shall provide the Expense ID of the record that needs to
be updated.

The system shall allow modification of relevant expense details.

---

## FR-05: Delete Expense

The system shall allow the user to delete an existing expense.

The user shall provide the Expense ID.

Before deletion, the system shall verify that the specified expense
exists.

---

## FR-06: Search Expense

The system shall allow users to search for expenses.

Search options shall include:

- Expense description
- Category
- Expense ID

The system shall display matching records.

---

## FR-07: Filter Expenses

The system shall allow users to filter expense records based on
selected criteria.

Possible filtering criteria include:

- Category
- Minimum amount
- Maximum amount
- Date

---

## FR-08: Sort Expenses

The system shall allow users to sort expense records.

Expenses can be sorted by:

- Amount
- Date
- Category

Both ascending and descending ordering may be supported where
applicable.

---

## FR-09: Set Monthly Budget

The system shall allow the user to set a monthly spending budget.

The budget amount must be greater than zero.

The system shall store the budget for later calculations.

---

## FR-10: View Budget Status

The system shall calculate and display:

- Monthly budget
- Total amount spent
- Remaining budget

The system shall also indicate whether the spending has exceeded
the available budget.

---

## FR-11: Generate Expense Report

The system shall generate a summary report containing information
such as:

- Total number of expenses
- Total amount spent
- Highest expense
- Lowest expense
- Category-wise expenditure
- Remaining budget

---

## FR-12: File Storage

The system shall store application data using local files.

The system shall be able to:

- Create data files when required.
- Save records.
- Read previously stored records.
- Update stored records.
- Preserve data between application executions.

---

## FR-13: Input Validation

The system shall validate user input before performing operations.

Examples include:

- Amount must be numeric.
- Amount must be greater than zero.
- Required text fields must not be empty.
- Menu choices must be valid.
- Dates must follow the expected format.
- Expense IDs must be valid.

---

## FR-14: Exception Handling

The system shall handle common runtime and input errors without
unexpectedly terminating the application.

Examples include:

- Invalid number input
- Invalid date input
- Missing file
- Invalid menu selection
- Non-existing Expense ID
- File reading/writing failure

---

## FR-15: Exit System

The system shall provide an option for the user to safely exit the
application.

Before termination, any required data shall be saved.

---

# 2. Non-Functional Requirements

Non-functional requirements describe the quality attributes and
operational characteristics of the system.

---

## NFR-01: Usability

The application should provide a simple and understandable
command-line interface.

Menu options and messages should clearly communicate what the user
needs to enter.

---

## NFR-02: Performance

The application should perform normal expense operations quickly
for the expected size of a student expense dataset.

The system should avoid unnecessary file operations and repeated
processing.

---

## NFR-03: Reliability

The application should continue operating correctly when users
provide invalid input or when expected data is unavailable.

Errors should be handled without causing unexpected application
termination.

---

## NFR-04: Maintainability

The application should follow a modular structure.

Different responsibilities should be implemented in separate classes
such as:

- Expense
- Budget
- User
- FileManager
- ExpenseManager
- ReportGenerator
- InputValidator

This makes the system easier to modify and extend.

---

## NFR-05: Resource Efficiency

The application should use system resources efficiently.

Local file storage will be used instead of requiring a continuously
running external database server.

Collections should only store the data required by the application.

---

## NFR-06: Scalability

The application should be designed so that additional functionality
can be added without significantly modifying existing modules.

Future modules may include:

- Graphical user interface
- Database support
- Advanced reports
- User authentication
- Export functionality

---

## NFR-07: Error Handling

The application shall provide meaningful error messages whenever an
operation fails.

For example:

"Invalid amount. Please enter a positive number."

instead of allowing the program to terminate unexpectedly.

---

## NFR-08: Maintainable Data Storage

Data files shall use a consistent format so that records can be
read and written reliably.

The file-handling logic shall be separated from the business logic.

---

## NFR-09: Portability

The application should run on systems that have a compatible Java
Development Kit installed.

The project should not depend on operating-system-specific
functionality.

---

## NFR-10: Security

The system shall avoid storing unnecessary sensitive information.

Only information required for expense management shall be stored.

---

# 3. Input Requirements

The primary user inputs are:

| Input | Description |
|---|---|
| Student Name | Name of the student |
| Student ID | Student identification |
| Expense Description | Description of expense |
| Expense Amount | Amount spent |
| Expense Category | Category of expense |
| Expense Date | Date of expense |
| Monthly Budget | Monthly spending limit |
| Menu Choice | Operation selected by user |
| Expense ID | ID of an existing expense |

---

# 4. Output Requirements

The system shall produce outputs such as:

- Expense records
- Updated expense records
- Search results
- Filtered records
- Sorted records
- Budget status
- Remaining budget
- Expense summaries
- Error messages
- Operation success messages

---

# 5. Functional Module Mapping

| Module | Main Responsibility |
|---|---|
| User Management | Manage student profile |
| Expense Management | Add, view, update and delete expenses |
| Budget Management | Set and monitor budget |
| Search & Filter | Find required expense records |
| Sorting | Arrange expense records |
| Reporting | Generate expense summaries |
| File Management | Store and retrieve data |
| Validation | Validate user input |
| Exception Handling | Handle runtime and input errors |
| Menu System | Control application workflow |

---

# 6. Requirement Summary

The system will provide a complete workflow:

User Input
↓
Input Validation
↓
Business Operation
↓
Data Processing
↓
File Storage
↓
Report / Result
↓
User

The functional requirements define what the system will do, while the
non-functional requirements define how the system should perform
those operations.
