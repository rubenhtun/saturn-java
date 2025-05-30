import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    private static Scanner scanner = new Scanner(System.in);

    // Function to get a positive income value
    private static double getPositiveIncomeValue(String prompt) {
        System.out.print(prompt);
        try {
            double value = scanner.nextDouble();
            scanner.nextLine(); // clear buffer
            if (value < 0) {
                System.out.println("Value cannot be negative. Please try again.");
                return getPositiveIncomeValue(prompt);
            }
            return value;
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a numeric value.");
            scanner.nextLine(); // clear invalid input
            return getPositiveIncomeValue(prompt);
        }
    }

    // Function to get fixed expenses
    private static double getFixedExpenses() {
        Map<String, Double> fixedExpenses = new HashMap<>();
        String[] categories = {"Rent/Mortgage", "Utilities", "Insurance", "Subscriptions"};

        System.out.println("\nWe will now gather your fixed expenses.");
        for (String category : categories) {
            double amount = getPositiveIncomeValue("Enter " + category + " cost: $");
            if (amount > 0) {
                fixedExpenses.put(category, amount);
            }
        }

        return fixedExpenses.values()
                .stream()
                .mapToDouble(Double::doubleValue)
                .sum();
    }

    // Function to get additional expenses
    private static double getAdditionalExpenses() {
        Map<String, Double> additionalExpenses = new HashMap<>();

        while (true) {
            System.out.println();
            System.out.println("Do you have any additional expenses? (e.g., groceries, entertainment)");
            System.out.print("Enter 'yes' to continue or 'no' to skip: ");
            String response = scanner.nextLine().trim().toLowerCase();

            if (!response.equals("yes")) {
                break;
            }

            System.out.print("Enter the category of the additional expense: ");
            String category = scanner.nextLine().trim();

            if (category.isEmpty()) {
                System.out.println("Category name cannot be empty. Please try again.");
                continue;
            }

            additionalExpenses.put(category, getPositiveIncomeValue("Enter " + category + " cost: $"));
        }

        return additionalExpenses.values()
                .stream()
                .mapToDouble(Double::doubleValue)
                .sum();
    }

    public static void calculateBudget() {
        System.out.println("Welcome to the Budget Calculator!");
        System.out.println("**************************");

        // Get monthly income
        double income = getPositiveIncomeValue("Enter your monthly income: $");

        // Get fixed expenses
        double fixedExpenses = getFixedExpenses();

        // Get additional expenses
        double additionalExpenses = getAdditionalExpenses();

        // Calculate total expenses
        double totalExpenses = fixedExpenses + additionalExpenses;

        // Calculate remaining budget
        double remainingBudget = income - totalExpenses;

        System.out.println("\nMonthly Budget Summary:");
        System.out.println("**************************");
        System.out.printf("Monthly Income: $%.2f%n", income);
        System.out.printf("Total Fixed Expenses: $%.2f%n", fixedExpenses);
        System.out.printf("Total Additional Expenses: $%.2f%n", additionalExpenses);
        System.out.printf("Total Expenses: $%.2f%n", totalExpenses);
        System.out.printf("Remaining Budget: $%.2f%n", remainingBudget);

        if (remainingBudget < 0) {
            System.out.println("Warning: You are over budget by $" + Math.abs(remainingBudget));
        } else {
            System.out.println("Great! You are within your budget.");
        }
    }

    public static void main(String[] args) {
        calculateBudget();
        scanner.close();
        System.out.println("Thank you for using the Budget Calculator!");
    }
}
