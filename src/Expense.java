public class Expense {

    private int id;
    private String description;
    private double amount;
    private String category;

    public Expense(int id, String description, double amount, String category) {
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

    public static void main(String[] args) {

        Expense expense = new Expense(
                1,
                "Lunch",
                120.0,
                "Food"
        );

        System.out.println("================================");
        System.out.println("       EXPENSE TEST");
        System.out.println("================================");

        expense.displayExpense();
    }
}