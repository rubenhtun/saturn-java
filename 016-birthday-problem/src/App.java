public class App {
    public static void main(String[] args) {
        // Number of days per year
        boolean[] used = new boolean[365];
        // Count the number of tries to find a repeated birthday
        int count = 0;

        // Harnessing While Loop for iteration until a repeated birthday is found
        while (true) {
            // Get a random birthday date
            int birthday = (int)(Math.random()*365);
            count++; // Increment of counting times

            // Check if the same birthday has already been recorded
            if(used[birthday]) {
                break; // Stop the iteration
            }

            // If not, record that the birthday has been found
            used[birthday] = true;
        }

        // Show the result
        System.out.println("\nThe next person who has same birthday has been found after " + count +" tries.");
    }
}
