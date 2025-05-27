import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] testedWords = {
            "silent", "listen", "inlets", "enlist", "tinsel", 
            "hello", "triangle", "integral", "altering", "regal", "large"
        };

        // Map to group words by their length
        Map<Integer, List<String>> anagramGroups = new HashMap<>();

        for (String word : testedWords) {
            int length = word.length();
            // Initialize group if it doesn't exist
            anagramGroups.computeIfAbsent(length, k -> new ArrayList<>()).add(word);
        }

        // Display the groups
        for (Map.Entry<Integer, List<String>> entry : anagramGroups.entrySet()) {
            System.out.println("Words of length " + entry.getKey() + ": " + entry.getValue());
        }
    }
}
