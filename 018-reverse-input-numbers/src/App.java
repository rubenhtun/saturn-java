import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int[] numbers = new int[100]; // An array for storing 100 input values
        int count = 0; // Counter the number of values saved
        int num; // Number to be saved 

        while (true) {
            System.out.print("Add a number: ");
            Scanner scanner = new Scanner(System.in);
            num = scanner.nextInt();

            if(num <= 0) {
                break;
            }

            numbers[count] = num;
            count++;
        }

        System.out.println("The numbers in reverse order are:");
        for(int i = count - 1; i >= 0; i--) {
            System.out.println(numbers[i] + " is at the position of " + i + " of the array.");
        }
    }
}
