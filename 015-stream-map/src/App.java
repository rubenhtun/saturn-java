import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        names.stream()
        .map(String::toUpperCase) // Transforms each name to uppercase
        .forEach(System.out::println); // Output: ALICE, BOB, CHARLIE
    }
}
