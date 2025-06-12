import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int[] numbers = new int[100]; // An array for storing 100 input values
        int count = 0; // Counter the number of values saved
        int num; // Number to be saved 

        Scanner scanner = new Scanner(System.in);

        while (true) { // Pull numbers in an array
            System.out.print("Add a number: ");
            num = scanner.nextInt();

            if(num <= 0) {
                break; // An input value equal to zero marks the end of the data
            }

            numbers[count] = num; // Insert value to the relevant index location
            count++; // Increment count
        }

        scanner.close();

        // Display final result
        System.out.println("The numbers in reverse order are:");
        for(int i = count - 1; i >= 0; i--) {
            System.out.println(numbers[i] + " is at position " + i + " in the array.");
        }
    }
}
