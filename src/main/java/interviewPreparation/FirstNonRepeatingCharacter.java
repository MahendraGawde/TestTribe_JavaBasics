package interviewPreparation;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String input = "swiss";

        // Create a LinkedHashMap to maintain the order of characters
        Map<Character, Integer> charCountMap = new LinkedHashMap<>();

        // Populate the map with character counts
        for (char ch : input.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        // Find the first character with a count of 1
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("The first non-repeating character is: " + entry.getKey());
                return;
            }
        }

        // If no non-repeating character is found
        System.out.println("No non-repeating character found.");
    }
}

