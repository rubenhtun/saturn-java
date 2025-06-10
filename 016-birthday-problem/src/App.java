public class App {
    public static void main(String[] args) {
        // Number of days per year
        boolean[] used = new boolean[365];
        // Count times to find the same number;
        int count = 0;

        // Harnessing While Loop for endless iteration
        while (true) {
            // Get a random birtday date
            int birtday = (int)(Math.random()*365);
            count++; // Increment of counting times

            // Check if the same birthday has been found for another person
            if(used[birtday]) {
                break; // Stop the iteration
            }

            // If not, to make sure to record that birthday has already found
            used[birtday] = true;
        }

        // Show the result
        System.out.println("\nThe next person who has same birthday has been found after " + count +" tries.");
    }
}
