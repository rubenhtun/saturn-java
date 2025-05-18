import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        // 1. Handling ArithmeticException
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to divide 100: ");
        try {
            int number = scanner.nextInt();
            int result = 100 / number;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed!");
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid integer!");
        }

        // 2. Handling IOException with File Reading
        try {
            BufferedReader reader = new BufferedReader(new FileReader("nonexistent.txt"));
            String line = reader.readLine();
            System.out.println("File content: " + line);
            reader.close();
        } catch (IOException e) {
            System.out.println("Error: File not found or cannot be read! (" + e.getMessage() + ")");
        }

        // 3. Using finally Block
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("example.txt"));
            String line = reader.readLine();
            System.out.println("First line of example.txt: " + line);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                    System.out.println("File reader closed successfully.");
                }
            } catch (IOException e) {
                System.out.println("Error closing file: " + e.getMessage());
            }
        }

        scanner.close();
    }
}