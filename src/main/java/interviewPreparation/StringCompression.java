package interviewPreparation;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringCompression {
    public static void main(String[] args) {
        String str = "aaabbbbcc";
        Map<Character,Integer> mapCountChars = new LinkedHashMap<>();

        for (int i = 0; i < str.length() ; i++) {
            char currentChar = str.charAt(i);
            // If the character is already in the map, increment its count
            if(mapCountChars.containsKey(currentChar)){
                mapCountChars.put(currentChar, mapCountChars.get(currentChar)+1);
            }else { // Otherwise, add it to the map with a count of 1
                mapCountChars.put(currentChar,1);
            }

        }
        StringBuilder output = new StringBuilder();
        for(Map.Entry<Character,Integer> entry : mapCountChars.entrySet()){
            output.append(entry.getKey()).append(entry.getValue());
        }
        System.out.println(output);
    }
}
