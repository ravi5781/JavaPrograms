package Stringss;

public class Reverse {

    // Method to reverse a text and print it
    static void stringMethod(String inputText) {
        String reversedText = "";
        for (int i = inputText.length() - 1; i >= 0; i--) {
            reversedText = reversedText + inputText.charAt(i);
        }
        System.out.println(reversedText);
    }

    // Method to return the reversed version of a word
    static String stringfun(String word) {
        String reversedWord = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord = reversedWord + word.charAt(i);
        }
        return reversedWord;
    }

    // Method to check if a given phrase is a palindrome
    static void polyn(String phrase) {
        String reversedPhrase = "";
        for (int i = phrase.length() - 1; i >= 0; i--) {
            reversedPhrase = reversedPhrase + phrase.charAt(i);
        }
        if (phrase.equalsIgnoreCase(reversedPhrase)) {
            System.out.println(phrase + " is a palindrome");
        } else {
            System.out.println(phrase + " is not a palindrome");
        }
    }

    // Method to check if a word is a palindrome and return boolean
    static boolean palin(String checkWord) {
        String reversedCheckWord = "";
        for (int i = checkWord.length() - 1; i >= 0; i--) {
            reversedCheckWord = reversedCheckWord + checkWord.charAt(i);
        }
        return checkWord.equalsIgnoreCase(reversedCheckWord);
    }

    public static void main(String[] args) {
        stringMethod("hello world"); // Reverse and print text

        polyn("MALAYALAM"); // Check if "MALAYALAM" is a palindrome

        boolean isPalindrome = palin("level"); // Check if "level" is a palindrome
        System.out.println(isPalindrome);

        String reversedOutput = stringfun("welcome"); // Reverse "welcome"
        System.out.println(reversedOutput);
    }
}
