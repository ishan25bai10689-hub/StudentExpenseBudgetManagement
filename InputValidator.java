public class InputValidator {

    public static boolean isValidAmount(double amount) {

        return amount > 0;
    }

    public static boolean isValidDescription(String description) {

        return description != null && !description.trim().isEmpty();
    }

    public static boolean isValidCategory(String category) {

        return category != null && !category.trim().isEmpty();
    }

    public static boolean isValidMenuChoice(int choice, int minimum, int maximum) {

        return choice >= minimum && choice <= maximum;
    }

    public static void displayAmountError() {

        System.out.println("Invalid amount.");
        System.out.println("Amount must be greater than zero.");
    }

    public static void displayDescriptionError() {

        System.out.println("Invalid description.");
        System.out.println("Description cannot be empty.");
    }

    public static void displayCategoryError() {

        System.out.println("Invalid category.");
        System.out.println("Category cannot be empty.");
    }

    public static void displayMenuError() {

        System.out.println("Invalid menu choice.");
        System.out.println("Please select a valid option.");
    }

    public static void main(String[] args) {

        System.out.println("================================");
        System.out.println("     INPUT VALIDATOR TEST");
        System.out.println("================================");

        double amount = 500.0;
        String description = "Books";
        String category = "Education";

        System.out.println();

        if (isValidAmount(amount)) {
            System.out.println("Amount validation: PASS");
        } else {
            displayAmountError();
        }

        if (isValidDescription(description)) {
            System.out.println("Description validation: PASS");
        } else {
            displayDescriptionError();
        }

        if (isValidCategory(category)) {
            System.out.println("Category validation: PASS");
        } else {
            displayCategoryError();
        }

        if (isValidMenuChoice(3, 1, 10)) {
            System.out.println("Menu choice validation: PASS");
        } else {
            displayMenuError();
        }
    }
}