import java.util.ArrayList;
import java.util.Scanner;

public class HarderChallenge {
    public static void main(String[] args) {
        // Prompt user to pick a number
        System.out.println("Listing prime numbers program!!!!!");
        System.out.print("Enter any number you like here: ");
        Scanner scanner = new Scanner(System.in);

        // Prime numbers list
        ArrayList<Integer> primIntegers = new ArrayList<>();

        try {
            // Get the input number
            int getInput = scanner.nextInt();
            for (int i = 3; i < getInput; i++) { // 2 and input number are excluded
                if (isPrime(i)) {
                    primIntegers.add(i);
                }
            }
            System.out.println("These are all prime numbers between 2 and " + getInput + " " + primIntegers + ".");
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        } finally {
            scanner.close();
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
