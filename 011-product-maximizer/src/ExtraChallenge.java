import java.util.ArrayList;
import java.util.Arrays;

public class ExtraChallenge {
  public static void main(String[] args) {
    // Declare two input ArrayLists with five numbers each, distinct from previous input
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(10, -20, 30, -40, 50));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(-15, 25, -35, 45, 60));

    // Initial max product
    int maxProduct = Integer.MIN_VALUE;
    int num1 = 0, num2 = 0;

    // Iterate through all pairs
    for (int x: list1) {
      for (int y: list2) {
        int product = x * y;
        if(product > maxProduct) {
          maxProduct = product;
          num1 = x;
          num2 = y;
        }
      }
    }

    // Store in an array
    ArrayList<Integer> resultArray = new ArrayList<>(Arrays.asList(num1, num2, maxProduct));
    System.out.println(resultArray);
  }
}
