package interviewPreparation;

import java.util.HashMap;
import java.util.Map;

public class ReverseEachWordWithMap {
    public static void main(String[] args) {
        String input = "Hello World from ChatGPT";
        String reversedString = reverseEachWord(input);
        System.out.println("Reversed String: " + reversedString);
    }

    public static String reverseEachWord(String str) {
        String[] words = str.split(" ");
        Map<String, String> wordMap = new HashMap<>();

        // Populate the map with each word and its reversed version
        for (String word : words) {
            String reversedWord = new StringBuilder(word).reverse().toString();
            wordMap.put(word, reversedWord);
        }

        // Build the reversed string by fetching each reversed word from the map
        StringBuilder reversedString = new StringBuilder();
        for (String word : words) {
            reversedString.append(wordMap.get(word)).append(" ");
        }

        return reversedString.toString().trim();
    }
}

