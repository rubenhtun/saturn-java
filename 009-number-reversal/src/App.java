import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("This is a number reversal program!!!!");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Can you prompt with any number so I will reverse it: ");
        int number = scanner.nextInt();
        scanner.close();

        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        System.out.println("This is your reversed number " + reversedNumber + ".");
    }
}
