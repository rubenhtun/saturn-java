import java.util.Scanner;

public class DecimalNumberReversal {
    public static void main(String[] args) {
        System.out.println("This is a decimal number reversal program!!!!");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Can you prompt with any decimal number so I will reverse it: ");
        String input = scanner.next();
        scanner.close();

        int indexOfDecimalPoint = input.indexOf('.');


        String removedDot = input.replace(".", "");
        String reversedDoubleWithoutDot = new StringBuilder(removedDot).reverse().toString();

        String result = reversedDoubleWithoutDot.substring(0, indexOfDecimalPoint)
                + "." + reversedDoubleWithoutDot.substring(indexOfDecimalPoint);

        System.out.println("This is your reversed decimal number: " + result);

    }
}
