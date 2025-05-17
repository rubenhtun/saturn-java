// Import BufferedWriter for efficient writing to a file
import java.io.BufferedWriter;
// Import File for handling file operations
import java.io.File;
// Import FileWriter for writing character data to a file
import java.io.FileWriter;
// Import IOException to handle input/output errors
import java.io.IOException;

// Define the WriteFile class to contain the file-writing logic
public class WriteFile {
    // The main method, entry point of the program
    public static void main(String[] args) {
        // Define the file path as a String; the file "poem.txt" will be created in the current working directory
        String filePath = "poem.txt";
        // Define the content to write to the file; a poem stored as a String with newline characters (\n) for line breaks
        String content = "Whispered winds through ancient trees,\n" +
                         "Moonlight dances on the seas,\n" +
                         "Shadows fade, the stars align,\n" +
                         "In night's embrace, our hearts entwine.";
        
        // Begin a try block to handle potential IOExceptions during file operations
        try {
            // Create a File object representing "poem.txt"
            File file = new File(filePath);
            // Check if the file does not exist to avoid overwriting an existing file
            if (!file.exists()) {
                // Create a FileWriter to write character data to the file
                FileWriter fileWriter = new FileWriter(file);
                // Wrap FileWriter in a BufferedWriter for efficient writing (reduces direct disk access)
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                // Write the poem content to the file
                bufferedWriter.write(content);
                // Close the BufferedWriter to flush data and release resources
                bufferedWriter.close();
                
                // Print a success message to the console
                System.out.println("Successfully wrote to the file.");
            }
        // Catch any IOException that might occur during file creation or writing
        } catch (IOException e) {
            // Print an error message to the standard error stream, including the exception's message
            System.err.println("An error occurred: " + e.getMessage());
            // Print the stack trace for debugging, showing where the error occurred
            e.printStackTrace();
        }        
    }
}