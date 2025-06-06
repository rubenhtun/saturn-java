import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        System.out.println("Prime factorization program.");

        int initialPrime = 87;
        ArrayList<Integer> allPrimeFactors = new ArrayList<>();
        for(int i = 2; i <= initialPrime; i++) {
            // Check if the divisible is a factor,
            if(initialPrime % i == 0 && isPrime(i)) {
                allPrimeFactors.add(i);
            }
        }

        // Show the result
        System.out.println("The prime factors of 87 are: " + allPrimeFactors + ".");
    }

    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
