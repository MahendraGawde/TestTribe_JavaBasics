package interviewPreparation;

import java.util.LinkedHashMap;
import java.util.Map;

public class SecondNonRepeatingCharacter {
    public static void main(String[] args) {
        String input = "swiss";

        Map<Character,Integer> charCountMap = new LinkedHashMap<>();

        for(char ch : input.toCharArray()){

            charCountMap.put(ch,charCountMap.getOrDefault(ch,0) +1);
        }
        int nonRepeatitiveCount = 0;

        for(Map.Entry<Character,Integer> entry : charCountMap.entrySet()){
           if(entry.getValue()==1)
            nonRepeatitiveCount++;
            if(nonRepeatitiveCount==2){
                System.out.println("Second Non-repeating character in input: " +entry.getKey());
                return;
            }
        }

    }


}
