// Import the File class from the java.io package
// This class represents file and directory pathnames in an abstract manner
// It allows you to create, delete, check, or manipulate files and directories
import java.io.File;

// Import the IOException class from the java.io package
// This is a checked exception that signals that an input/output operation has failed or been interrupted
// For example, when you try to create or read a file and something goes wrong (like permission denied)
// You need to handle or declare this exception in your code to prevent crashes
import java.io.IOException;

public class CreateFile {

    public static void main(String[] args) {
        // Use try-catch to handle possible IO exceptions when working with files
        try {
            // Create a File object representing the file named "demon.txt"
            File newFile = new File("demon.txt");

            // Attempt to create the file on the disk
            if (newFile.createNewFile()) {
                // If the file is created successfully, print the file name
                System.out.println("File created: " + newFile.getName());
            } else {
                // If the file already exists, inform the user
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            // If an I/O error occurs (e.g., permission issues), handle it here
            System.out.println("An error occurred.");
            e.printStackTrace();  // Print detailed error info
        }
    }
}
