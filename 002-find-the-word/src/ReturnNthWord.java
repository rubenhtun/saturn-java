import java.util.Scanner;

public class ReturnNthWord {

    // Finds and returns the nth word in a sentence
    public static String findNthWord(String sentence, int n) {
        String[] words = sentence.split(" ");
        if (n < 1 || n > words.length) {
            return "No word found at position " + n + ".";
        }
        return words[n - 1];
    }

    // Reads input and displays the nth word
    public static void main(String[] args) {
        System.out.println("This program will find the nth word in a sentence.");

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Paste a sentence you like: ");
            String sentence = scanner.nextLine();

            System.out.print("Enter the position of the word to retrieve: ");
            int n = scanner.nextInt();

            String nthWord = findNthWord(sentence, n);
            System.out.println("The word at position " + n + " is: " + nthWord);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            System.out.println("Thank you for using the program!");
        }
    }
}
