import java.util.ArrayList;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ExpenseManager manager = new ExpenseManager();

        int choice;

        do {

            System.out.println();
            System.out.println("==============================================");
            System.out.println("     STUDENT EXPENSE & BUDGET MANAGEMENT");
            System.out.println("==============================================");
            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. Update Expense");
            System.out.println("4. Delete Expense");
            System.out.println("5. View Total Expenses");
            System.out.println("6. Exit");
            System.out.println("==============================================");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:

                    System.out.println();
                    System.out.println("========== ADD EXPENSE ==========");

                    System.out.print("Enter Expense ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Description: ");
                    String description = scanner.nextLine();

                    System.out.print("Enter Amount: ");
                    double amount = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Enter Category: ");
                    String category = scanner.nextLine();

                    Expense expense = new Expense(
                            id,
                            description,
                            amount,
                            category
                    );

                    manager.addExpense(expense);

                    break;

                case 2:

                    manager.viewExpenses();

                    break;

                case 3:

                    System.out.println();
                    System.out.println("========== UPDATE EXPENSE ==========");

                    System.out.print("Enter Expense ID: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter New Description: ");
                    String newDescription = scanner.nextLine();

                    System.out.print("Enter New Amount: ");
                    double newAmount = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Enter New Category: ");
                    String newCategory = scanner.nextLine();

                    manager.updateExpense(
                            updateId,
                            newDescription,
                            newAmount,
                            newCategory
                    );

                    break;

                case 4:

                    System.out.println();
                    System.out.println("========== DELETE EXPENSE ==========");

                    System.out.print("Enter Expense ID: ");
                    int deleteId = scanner.nextInt();
                    scanner.nextLine();

                    manager.deleteExpense(deleteId);

                    break;

                case 5:

                    System.out.println();
                    System.out.println("========== TOTAL EXPENSES ==========");

                    System.out.println(
                            "Total Expenses: Rs."
                            + manager.getTotalExpenses()
                    );

                    break;

                case 6:

                    System.out.println();
                    System.out.println("Thank you for using the system!");
                    System.out.println("Program closed successfully.");

                    break;

                default:

                    System.out.println();
                    System.out.println("Invalid choice.");
            }

        } while (choice != 6);

        scanner.close();
    }
}


/* ================= EXPENSE MANAGER ================= */

class ExpenseManager {

    private ArrayList<Expense> expenses;

    public ExpenseManager() {
        expenses = new ArrayList<>();
    }

    public void addExpense(Expense expense) {

        expenses.add(expense);

        System.out.println("Expense added successfully.");
    }

    public void viewExpenses() {

        if (expenses.isEmpty()) {

            System.out.println();
            System.out.println("No expenses available.");

            return;
        }

        System.out.println();
        System.out.println("========== ALL EXPENSES ==========");

        for (Expense expense : expenses) {

            expense.displayExpense();

            System.out.println("----------------------------------");
        }
    }

    public double getTotalExpenses() {

        double total = 0;

        for (Expense expense : expenses) {

            total = total + expense.getAmount();
        }

        return total;
    }

    public void updateExpense(
            int id,
            String description,
            double amount,
            String category) {

        for (Expense expense : expenses) {

            if (expense.getId() == id) {

                expense.setDescription(description);
                expense.setAmount(amount);
                expense.setCategory(category);

                System.out.println("Expense updated successfully.");

                return;
            }
        }

        System.out.println(
                "Expense with ID " + id + " not found."
        );
    }

    public void deleteExpense(int id) {

        for (int i = 0; i < expenses.size(); i++) {

            if (expenses.get(i).getId() == id) {

                expenses.remove(i);

                System.out.println("Expense deleted successfully.");

                return;
            }
        }

        System.out.println(
                "Expense with ID " + id + " not found."
        );
    }
}


/* ================= EXPENSE ================= */

class Expense {

    private int id;
    private String description;
    private double amount;
    private String category;

    public Expense(
            int id,
            String description,
            double amount,
            String category) {

        this.id = id;
        this.description = description;
        this.amount = amount;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }

    public String getCategory() {
        return category;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void displayExpense() {

        System.out.println("Expense ID: " + id);
        System.out.println("Description: " + description);
        System.out.println("Amount: Rs." + amount);
        System.out.println("Category: " + category);
    }
}