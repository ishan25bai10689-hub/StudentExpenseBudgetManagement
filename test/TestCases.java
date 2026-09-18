/*
 * Basic project test for Smart Travel Budget Planner /
 * Student Expense & Budget Management System.
 *
 * This test uses reflection, so no external JUnit library is required.
 * Place this file inside the Tests folder.
 *
 * Run after compiling the files in src:
 *     javac -d out src/*.java Tests/TestCases.java
 *     java -cp out TestCases
 */

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

public class TestCases {

    private static int passed = 0;
    private static int failed = 0;

    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("   PROJECT TEST - EXPENSE MANAGEMENT");
        System.out.println("========================================");

        testClassExists("Expense");
        testClassExists("Budget");
        testClassExists("ExpenseManager");
        testClassExists("InputValidator");

        testMethods("Expense", Arrays.asList(
                "getId", "getDescription", "getAmount", "getCategory",
                "setDescription", "setAmount", "setCategory", "displayExpense"
        ));

        testMethods("Budget", Arrays.asList(
                "getMonthlyBudget", "setMonthlyBudget", "displayBudget"
        ));

        testMethods("ExpenseManager", Arrays.asList(
                "addExpense", "viewExpenses", "updateExpense",
                "deleteExpense", "getTotalExpenses"
        ));

        testMethods("InputValidator", Arrays.asList(
                "isValidAmount", "isValidDescription",
                "isValidCategory", "isValidMenuChoice",
                "displayErrorMethods"
        ));

        System.out.println("----------------------------------------");
        System.out.println("Tests Passed : " + passed);
        System.out.println("Tests Failed : " + failed);
        System.out.println("----------------------------------------");

        if (failed == 0) {
            System.out.println("RESULT: ALL TESTS PASSED");
        } else {
            System.out.println("RESULT: SOME TESTS FAILED");
        }
    }

    private static void testClassExists(String className) {
        try {
            Class.forName(className);
            System.out.println("[PASS] Class exists: " + className);
            passed++;
        } catch (ClassNotFoundException e) {
            System.out.println("[FAIL] Class not found: " + className);
            failed++;
        }
    }

    private static void testMethods(String className, List<String> requiredMethods) {
        try {
            Class<?> clazz = Class.forName(className);
            Method[] methods = clazz.getDeclaredMethods();

            for (String required : requiredMethods) {
                boolean found = false;

                for (Method method : methods) {
                    if (method.getName().equals(required)) {
                        found = true;
                        break;
                    }
                }

                if (found) {
                    System.out.println("[PASS] " + className + "." + required + "()");
                    passed++;
                } else {
                    System.out.println("[FAIL] Missing method: "
                            + className + "." + required + "()");
                    failed++;
                }
            }
        } catch (ClassNotFoundException e) {
            System.out.println("[FAIL] Cannot test methods because class is missing: "
                    + className);
            failed += requiredMethods.size();
        }
    }
}
