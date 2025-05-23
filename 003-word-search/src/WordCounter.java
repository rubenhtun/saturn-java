import java.util.Scanner;
import java.util.List;

public class WordCounter {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        // Prompt user for input string
        System.out.print("Enter a long string: ");
        String inputString = scanner.nextLine();

        // Prompt user for the word to check
        System.out.println("The number of times your input word appears in the string will be counted.");
        System.out.print("Enter the word to check: ");
        String wordToCheck = scanner.nextLine();

        // Count occurrences of the word
        List<String> words = List.of(inputString.split(" "));
        int count = 0;
        // Iterate through the list of words and count occurrences
        for (String word: words) {
          if(word.equals(wordToCheck)) {
            count++;
          }
        }

        // Display the result
        System.out.println("The word '" + wordToCheck + "' appears " + count + " times in the string.");

        scanner.close();
  }
}
