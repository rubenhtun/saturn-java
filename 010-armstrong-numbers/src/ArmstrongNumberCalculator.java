import java.util.Scanner;

public class ArmstrongNumberCalculator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("I am an Armstrong number calculator, so I will find all possible Armstrong numbers between 0 and your input number.");
    System.out.print("Enter any number you like here: ");
    int inputNum = scanner.nextInt();
    scanner.close();

    for (int i = 1; i <= inputNum; i++) {
      // The original value;
      int originalValue = i;
      // Number of digits
      int numOfDigits = String.valueOf(originalValue).length();
      // The total value;
      int total = 0;

      // To extract each digit from a given number
      while (originalValue != 0) {
        int remainder = originalValue % 10;
        total += (int) Math.pow(remainder, numOfDigits);
        originalValue = originalValue / 10;
      }

      // Finally check if the number is an Armstrong number
      if (i == total) {
        System.out.println(i + " is an Armstrong number.");
      }
    }
  }
}
