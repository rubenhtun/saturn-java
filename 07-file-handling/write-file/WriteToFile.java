import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        // Try block to handle file writing and potential errors
        try {
            // Create FileWriter to write to AtoZ.txt
            FileWriter myWriter = new FileWriter("AtoZ.txt");
            // Write the pangram to the file
            myWriter.write("The quick brown fox jumps over the lazy dog.");
            // Close the writer to save and release resources
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            // Handle file-related errors
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}