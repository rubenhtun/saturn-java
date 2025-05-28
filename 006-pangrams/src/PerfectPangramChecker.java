import java.util.HashSet;
import java.util.Scanner;

public class PerfectPangramChecker {
  public static void main(String[] args) {
        // Create a scanner to read user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        // Convert input to lowercase and into a character array
        char[] characters = input.toLowerCase().toCharArray();

        // Use HashSet to store unique alphabetic characters
        HashSet<Character> letters = new HashSet<>();

        // Loop through each character
        for (char c : characters) {
            // Only add characters that are letters (a-z)
            if (c >= 'a' && c <= 'z') {
                // To chech whether the letter is already present in the set
                if(letters.contains(c)) {
                    System.out.println("\n The sentence is not a perfect pangram.");
                    scanner.close();
                    return; // Exit if a letter is repeated
                }
                letters.add(c);
            }
        }

        // A sentence is a pangram if it contains all 26 letters
        if (letters.size() == 26) {
            System.out.println("\n The sentence is a perfect pangram.");

        } else {
            System.out.println("\n The sentence is not a perfect pangram.");
        }

        // Close the scanner
        scanner.close();
    }
}
