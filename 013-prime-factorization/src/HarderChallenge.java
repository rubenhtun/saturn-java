import java.util.ArrayList;

public class HarderChallenge {
      public static void main(String[] args) {
        System.out.println("Returning factors of any number between 2 and 100!!!");

        for(int i = 3; i <= 100; i++) {
          ArrayList<Integer> allPrimeFactors = new ArrayList<>();
            for(int j = 2; j <= i; j++) {
                // Check if the divisible is a factor,
                if(i % j == 0 && isPrime(j)) {
                    allPrimeFactors.add(j);
                }
            }
            // Show the result
            System.out.println("Prime factors of " + i + " are " + allPrimeFactors + ".");
        }
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