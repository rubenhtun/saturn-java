// math_library.java
// Demonstrates mathematical operations using the Java Math library

public class MathLibrary {
    public static void main(String[] args) {
        // 1. Math.abs() - Absolute Value
        int negativeNum = -15;
        int absoluteValue = Math.abs(negativeNum);
        System.out.println("Absolute value of " + negativeNum + ": " + absoluteValue);

        // 2. Math.sqrt() - Square Root
        double number = 49.0;
        double squareRoot = Math.sqrt(number);
        System.out.println("Square root of " + number + ": " + squareRoot);

        // 3. Math.pow() - Power
        double base = 5.0;
        double exponent = 2.0;
        double powerResult = Math.pow(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + ": " + powerResult);

        // 4. Math.max() and Math.min() - Maximum and Minimum
        int num1 = 25;
        int num2 = 10;
        int maxValue = Math.max(num1, num2);
        int minValue = Math.min(num1, num2);
        System.out.println("Maximum of " + num1 + " and " + num2 + ": " + maxValue);
        System.out.println("Minimum of " + num1 + " and " + num2 + ": " + minValue);

        // 5. Math.round() - Rounding to Nearest Integer
        double decimalNum = 7.89;
        long roundedValue = Math.round(decimalNum);
        System.out.println("Rounded value of " + decimalNum + ": " + roundedValue);

        // 6. Math.random() - Random Number
        double randomValue = Math.random();
        System.out.println("Random number (0.0 to 1.0): " + randomValue);

        // 7. Math.PI and Math.sin() - Trigonometric Example
        double angleInDegrees = 90.0;
        double angleInRadians = Math.toRadians(angleInDegrees);
        double sineValue = Math.sin(angleInRadians);
        System.out.println("Sine value of 90 degrees: " + sineValue);
    }
}