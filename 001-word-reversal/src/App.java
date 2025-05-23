import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class App {

    // Capitalizes the first letter of the input string
    public static String capitalizeFirstLetter(String input) {
        if (input == null || input.isEmpty()) return input;
        return input.substring(0, 1).toUpperCase() + input.substring(1);
    }

    // Reverses the order of words in the sentence and capitalizes the first letter
    public static String reverseSentence(String sentence) {
        List<String> words = Arrays.asList(sentence.split(" "));
        Collections.reverse(words);
        String reversed = String.join(" ", words);
        return capitalizeFirstLetter(reversed);
    }

    // Main method: gets user input, processes it, and displays the result
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Write a sentence to be reversed: ");
            String sentence = scanner.nextLine();
            String result = reverseSentence(sentence);
            System.out.println("Original sentence: " + sentence);
            System.out.println("Reversed sentence: " + result);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
