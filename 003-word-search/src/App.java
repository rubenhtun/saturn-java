import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Prompt user for the word to check
        System.out.print("Enter the word to check: ");
        String wordToCheck = scanner.nextLine();

        // Check and display whether the string starts with the given word
        boolean result = inputString.startsWith(wordToCheck);
        System.out.println("Result: " + result);

        scanner.close();
    }
}
