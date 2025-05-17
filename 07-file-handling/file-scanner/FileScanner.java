import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

// Class to read and print tokens from a file using Scanner
public class FileScanner {
    public static void main(String[] args) {
        // Try block to handle file reading and potential errors
        try {
            // Create File object for numbers.txt
            File file = new File("numbers.txt");
            // Initialize Scanner to read from the file
            Scanner scanner = new Scanner(file);

            // Read and print each token (word or number) from the file
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            // Close the scanner to release resources
            scanner.close();
        } catch (FileNotFoundException e) {
            // Handle case where the file is not found
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}