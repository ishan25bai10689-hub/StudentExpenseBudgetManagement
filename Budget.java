public class Budget {

    private double monthlyBudget;

    public Budget(double monthlyBudget) {
        this.monthlyBudget = monthlyBudget;
    }

    public double getMonthlyBudget() {
        return monthlyBudget;
    }

    public void setMonthlyBudget(double monthlyBudget) {
        this.monthlyBudget = monthlyBudget;
    }

    public void displayBudget() {
        System.out.println("Monthly Budget: Rs." + monthlyBudget);
    }

    public static void main(String[] args) {

        Budget budget = new Budget(10000.0);

        System.out.println("================================");
        System.out.println("       BUDGET TEST");
        System.out.println("================================");

        budget.displayBudget();
    }
}