import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<String> brackets = new ArrayList<>();
        brackets.add("[{(})]"); // This is one full string

        String full = brackets.get(0); // "[{(})]"

        // Optional: break string into characters if needed
        ArrayList<String> chars = new ArrayList<>();
        for (char ch : full.toCharArray()) {
            chars.add(String.valueOf(ch));
        }

        // Example check: first and last characters
        if (chars.get(0).equals("[") && chars.get(chars.size() - 1).equals("]")) {
            System.out.println("[] does work!!!");
        } else if (chars.get(1).equals("{") && chars.get(chars.size() - 2).equals("}")) {
            System.out.println("{} does work!!!");
        }

        // Avoid infinite loop unless intentional
    }
}