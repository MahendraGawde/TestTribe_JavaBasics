package interviewPreparation;

import java.util.HashMap;
import java.util.Map;

public class MaxFrequencyChar {
    public static void main(String[] args) {
        String s = "aaaaabcdbbaada";
        char maxChar = ' ';
        int maxCount = 0;

        // Create a HashMap to store character counts
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Count frequency of each character
        for (char c : s.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Find the character with the highest frequency
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxChar = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        // Display the result
        System.out.println("Character that appears most frequently: " + maxChar);
        System.out.println("Frequency: " + maxCount);

    }
}
