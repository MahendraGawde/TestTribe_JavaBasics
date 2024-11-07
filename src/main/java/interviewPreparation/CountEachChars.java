package interviewPreparation;

import java.util.HashMap;
import java.util.Map;

public class CountEachChars {

    public static void main(String args[]) {
        String input = "rishi raj";
        Map<Character, Integer> charCountMap = countChars(input);

        // Print the character counts
        charCountMap.forEach((key, value) ->
                System.out.println("Character '" + key + "' occurs " + value + " times.")
        );
    }

    public static Map<Character, Integer> countChars(String str) {
        Map<Character, Integer> countChars = new HashMap<>();
        str = str.toLowerCase();

        for (char c : str.toCharArray()) {
            if (c != ' ') {  // Skip spaces
                countChars.put(c, countChars.getOrDefault(c, 0) + 1);
            }
        }

        return countChars;
    }
}
