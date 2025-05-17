import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class StringManipulation {
  public static void main(String[] args) {
    String text = "";

    try {
      // Create a File object pointing to "sample.txt"
      File file = new File("sample.txt");

      // Create a Scanner object to read the file
      Scanner scanner =  new Scanner(file);

      // Read the first line from the file if it exists
      if(scanner.hasNextLine()) {
        text = scanner.nextLine(); // Store the line in 'text'
      }

      // Close the scanner to free resources
      scanner.close();

    } catch (FileNotFoundException e) {
      // Handle the case when the file is not found
      System.out.println("File not found: " + e.getMessage());
    }

    // Print the original text
    System.out.println("Original: " + text);

    // Print the length of the text
    System.out.println("Length: " + text.length());

    // Convert and print the text in uppercase
    System.out.println("Uppercase: " + text.toUpperCase());

    // Print a substring of the text from index 4 to 8 (9 is exclusive)
    System.out.println("Substring (4,9): " + text.substring(4, 9));
        
    System.out.println("Words:");

    // Split the text by spaces and print each word
    String[] words = text.split(" ");
    for (String word : words) {
      System.out.println("- " + word);
    }
  }
}
