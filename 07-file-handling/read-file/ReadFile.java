// Import the File class from the java.io package
// File represents a file or directory path in the filesystem.
// You use this class to create, delete, or check files and directories.
import java.io.File;

// Import the FileNotFoundException class from the java.io package
// This exception is thrown when the program tries to open a file that does not exist.
// You can catch this exception to handle the error gracefully instead of crashing.
import java.io.FileNotFoundException;

// Import the Scanner class from the java.util package
// Scanner is a utility class used to read input from various sources like input streams, strings, or files.
// In file reading, Scanner can read a file line-by-line or token-by-token.
import java.util.Scanner;

public class ReadFile {

    public static void main(String[] args) {

        // Use try-catch block to handle exceptions that may occur during file operations
        try {
            // Create a File object representing the file named "example.txt"
            File myObj = new File("example.txt");

            // Create a Scanner object to read from the file
            Scanner myReader = new Scanner(myObj);

            // Loop while the file has another line to read
            while (myReader.hasNextLine()) {
                // Read the next line from the file and store it in the variable 'data'
                String data = myReader.nextLine();

                // Print the line read from the file to the console
                System.out.println(data);
            }

            // Close the Scanner to free up resources associated with the file
            myReader.close();

        } catch (FileNotFoundException e) {
            // This block executes if "example.txt" does not exist or cannot be opened

            // Print an error message to the console
            System.out.println("An error occurred.");

            // Print detailed error information (stack trace) to help diagnose the problem
            e.printStackTrace();
        }
    }
}
