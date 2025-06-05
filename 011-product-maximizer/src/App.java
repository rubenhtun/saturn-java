import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class App {
    public static void main(String[] args) {
        // Declare an array list of numbers
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(234, 35, 37, 123, 456, 78, 89, 567, 321, 654));
        
        // Order numbers from large to small value
        Collections.sort(numbers, Collections.reverseOrder());

        // Get the two largest numbers
        int firstLargestNum = numbers.get(0);
        int secondLargestNum = numbers.get(1);

        // Finally, find the largest product of those two numbers
        int product = firstLargestNum * secondLargestNum;
        ArrayList<Integer> resultArray = new ArrayList<>(Arrays.asList(firstLargestNum, secondLargestNum, product));
        System.out.println(resultArray);
    }
}
