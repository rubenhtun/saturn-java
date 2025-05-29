public class YAsVowel {
  public static void main(String[] args) {
    char[] vowels = {'a', 'e', 'i', 'o', 'u'};

    char[] text = "I Love Codecademy".toLowerCase().toCharArray();

    int numberOfVowels = 0;
    int numberOfConsonants = 0;

    for (char letter : text) {
      if (Character.isLetter(letter)) {
        boolean isVowel = false;

        // Check if it's a standard vowel
        for (char vowel : vowels) {
          if (letter == vowel) {
            numberOfVowels++;
            isVowel = true;
            break;
          }
        }

        // Special case for 'y'
        if (!isVowel && letter == 'y') {
          numberOfVowels++;
          isVowel = true;
        }

        // If not a vowel, count as consonant
        if (!isVowel) {
          numberOfConsonants++;
        }
      }
    }

    System.out.println("Number of vowels: " + numberOfVowels);
    System.out.println("Number of consonants: " + numberOfConsonants);
  }
}
