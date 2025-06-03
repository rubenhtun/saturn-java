import java.util.Scanner;

public class DecimalNumberReversal {
    public static void main(String[] args) {
        System.out.println("This is a decimal number reversal program!!!!");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Can you prompt with any decimal number so I will reverse it: ");
        String inputNum = scanner.next();
        scanner.close();

        String reversedNumber = new StringBuilder(inputNum).reverse().toString();

        System.out.println("This is your reversed decimal number " + reversedNumber + ".");
    }
}
