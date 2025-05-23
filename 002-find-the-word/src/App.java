import java.util.Scanner;

public class App {

    // To find and return the second word in a sentence
    public static String findSecondWord(String sentence) {
        String[] words = sentence.split(" ");
        if (words.length < 2) {
            return "No second word found.";
        }
        return words[1];
    }

    // To read input and display the second word
    public static void main(String[] args) {
        System.out.println("This program will find the second word in a sentence.");
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Paste a sentence here: ");
            String sentence = scanner.nextLine();
            String secondWord = findSecondWord(sentence);
            System.out.println("The second word is: " + secondWord);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            System.out.println("Thank you for using the program!");
        }
    }
}
