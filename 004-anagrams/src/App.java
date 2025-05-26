public class App {
    public static void main(String[] args) {
        // Define test cases as a 2D array of word pairs to check for anagrams
        String[][] testedWords = {
            {"listen", "silent"},
            {"triangle", "integral"},
            {"apple", "pale"},
            {"evil", "vile"},
            {"fluster", "restful"},
            {"hello", "world"},
            {"astronomer", "moon starer"},
        }; 

        // Iterate through each pair of words in the test cases
        for (String[] testedWord : testedWords) {
            // Extract the two words from the current pair
            String word1 = testedWord[0];
            String word2 = testedWord[1];
            
            // Check if the words have different lengths (not anagrams if they do)
            if (word1.length() != word2.length()) {
                System.out.println("The words '" + word1 + "' and '" + word2 + "' are not anagrams because they have different lengths.");
                continue; // Skip to the next pair
            }

            // Convert words to lowercase char arrays for case-insensitive comparison
            char[] charArray1 = word1.toLowerCase().toCharArray();
            char[] charArray2 = word2.toLowerCase().toCharArray();
            
            // Sort both character arrays to compare letter frequencies
            java.util.Arrays.sort(charArray1);
            java.util.Arrays.sort(charArray2);

            // Check if sorted arrays are equal to determine if words are anagrams
            if (java.util.Arrays.equals(charArray1, charArray2)) {
                System.out.println("The words '" + word1 + "' and '" + word2 + "' are anagrams.");
            } else {
                System.out.println("The words '" + word1 + "' and '" + word2 + "' are not anagrams.");
            }
        }
    }
}