import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Declare and print the list of prime numbers
        ArrayList<Integer> primeNumbers = new ArrayList<>(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19));
        System.out.println("These are the first few prime numbers: " + primeNumbers);

        // Prompt user to pick a prime number
        System.out.print("Enter any prime number you like here: ");
        Scanner scanner = new Scanner(System.in);

        try {
            // Get the input number
            int getInput = scanner.nextInt();

            // Check if the input is in the primeNumbers list
            if (primeNumbers.contains(getInput)) {
                System.out.println("Yes, you are right. " + getInput + " is a prime number.");
            } else {
                // Check if the input is prime
                if (isPrime(getInput)) {
                    System.out.println(getInput + " is a prime number.");
                } else {
                    System.out.println("That is not a prime number.");
                }
            }
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