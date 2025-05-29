public class App {
    public static void main(String[] args) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        String input = "Exploring Java on Saturn's rings, Ruben writes code passionately—optimizing functions, debugging errors, and solving challenges in the vacuum of space.";

        int numberOfVowels = 0;
        int numberOfConsonants = 0;

        for(char letter: input.toLowerCase().toCharArray()) {
            // Check if the character is a letter
            if(Character.isLetter(letter)) {
                boolean isVowel = false;
                // Check if the letter is a vowel
                for(char vowel: vowels) {
                    if(letter == vowel) {
                        numberOfVowels++;
                        isVowel = true;
                        break;
                    }
                }
                // If it's not a vowel, it's a consonant
                if(!isVowel) {
                    numberOfConsonants++;
                }
            }
        }

        System.out.println("Number of vowels: " + numberOfVowels);
        System.out.println("Number of consonants: " + numberOfConsonants);
    }
}
