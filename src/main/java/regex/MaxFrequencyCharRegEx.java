package regex;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MaxFrequencyCharRegEx {
    public static void main(String[] args) {
        String s = "aaaaabcababcdea";
        char maxChar = ' ';
        int maxCount = 0;

        Map<Character,Integer> charCountMap = new HashMap<>();
        Pattern pattern = Pattern.compile("[a-zA-Z]");
        Matcher matcher = pattern.matcher(s);

        while(matcher.find()){
            char c = matcher.group().charAt(0);
            charCountMap.put(c,charCountMap.getOrDefault(c,0)+1);
        }

        for(Map.Entry<Character,Integer> entry: charCountMap.entrySet()){
            if(entry.getValue()>maxCount){
                maxChar = entry.getKey();
                maxCount = entry.getValue();
            }
        }
        System.out.println("Character appears most frequently: " +maxChar);
        System.out.println("Frequency: " +maxCount);

    }
}
