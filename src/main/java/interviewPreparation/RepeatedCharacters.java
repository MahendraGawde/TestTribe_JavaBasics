package interviewPreparation;

import java.util.HashMap;
import java.util.Map;

public class RepeatedCharacters {
    public static void main(String[] args) {
        String input = "Programming in java";
        countRepeatedChars(input);
    }

    public static void countRepeatedChars(String str){
        // Create hashmap to store character counts
        Map<Character, Integer> charCountMap = new HashMap<>();

        //Convert string to character array
        char[] charArray = str.toCharArray();

        //Iterate over character array
        for(char c : charArray){
            if(c == ' '){//ignore spaces
                continue;
            }
            charCountMap.put(c, charCountMap.getOrDefault(c,0) +1);
        }
        //Print repeated characters
        System.out.println("Repeated characters in string: ");

        for(Map.Entry<Character,Integer> entry : charCountMap.entrySet()){
            if(entry.getValue() > 1){
                System.out.println(entry.getKey() + " : " + entry.getValue() +" times");
            }
        }
    }
}
