package interviewPreparation;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountWordsFrequency {
    public static void main(String[] args) {
        String input = "She sells seashells by the seashore. The shells she sells are surely seashells";
        input = input.toLowerCase();
        String[] words = input.split("\\s");

        Map<String, Integer> wordCountMap = new LinkedHashMap<>();

        for(String word: words){
            wordCountMap.put(word,wordCountMap.getOrDefault(word,0)+1);
        }

        for(Map.Entry<String,Integer> entry: wordCountMap.entrySet()){
            System.out.println( entry.getKey()+ " : " +entry.getValue());
        }

    }
}
