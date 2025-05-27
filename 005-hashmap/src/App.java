import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class App {
    public static void main(String[] args) {
        String[] words = {"book", "code", "java", "stream", "map", "filter", "loop", "tree", "graph"};

        HashMap<Integer, List<String>> groupedWords = new HashMap<>();

        for (String word : words) {
            int key = word.length();

            // If the key doesn't exist, create a new list
            if (!groupedWords.containsKey(key)) {
                groupedWords.put(key, new ArrayList<>());
            }

            // Add the word to the correct list
            groupedWords.get(key).add(word);
        }

        // Display the result
        for (Integer length : groupedWords.keySet()) {
            System.out.println("Words of length " + length + ": " + groupedWords.get(length));
        }
    }
}
