import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number you like here: ");
        int inputNum = scanner.nextInt();
        int numOfDigits = String.valueOf(inputNum).length();
        scanner.close();

        // The original value;
        int originalValue = inputNum;
        // The total value;
        int total = 0;

        // To extract each digit from a given number
        while(inputNum != 0) {
            int remainder = inputNum % 10;
            total += Math.pow(remainder, numOfDigits);
            inputNum = inputNum / 10;
        }

        // Finally check if the input number is a armstrong number
        if (originalValue == total) {
            System.out.println("Yes, your input number is an Armstrong number.");
        } else {
            System.out.println("No, your input number is NOT an Armstrong number.");
        }
    }
}
