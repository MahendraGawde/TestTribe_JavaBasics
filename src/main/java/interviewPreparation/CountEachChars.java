package interviewPreparation;

import java.util.HashMap;
import java.util.Map;

public class CountEachChars {

    public static void main(String args[]) {
        String input = "rishi";
        Map<Character, Integer> charCountMap = countChars(input);

        // Print the character counts
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println("Character '" + entry.getKey() + "' occurs " + entry.getValue() + " times.");
        }
    }

    public static Map<Character,Integer> countChars(String str){
        Map<Character, Integer> countChars = new HashMap<>();

        str = str.toLowerCase();
        char[] charArray = str.toCharArray();

        for(char c : charArray){
            if (countChars.containsKey(c)){
                countChars.put(c, countChars.get(c) +1);

            }else{
                countChars.put(c,1);
            }
        }
        return countChars;

    }
}
