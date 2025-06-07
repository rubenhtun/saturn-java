import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("************Summation program************");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNum = scanner.nextInt();
        System.out.print("Enter second number: ");
        int secondNum = scanner.nextInt();
        scanner.close();

        // Summation
        int result = firstNum + secondNum;

        // Display answer
        System.out.println("The sum of those two numbers is " + result + ".");
    }
}
