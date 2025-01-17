package interviewPreparation;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountFrequencyOfWords {

    public static void main(String[] args) {
        String str = "This is java test with java language test";

        Map<String, Integer> countWordFrequency = countFrequencyWords(str);
        for(Map.Entry<String,Integer> entry: countWordFrequency.entrySet()){
            System.out.println("word : '" +entry.getKey()+"' occurs " +entry.getValue()+ " times" );
        }
    }

    private static Map<String, Integer> countFrequencyWords(String str) {

        String[] words = str.split("\\s+");

        Map<String,Integer> frequencyMap = new LinkedHashMap<>();

        for(String word: words){
            frequencyMap.put(word,frequencyMap.getOrDefault(word,0)+1);
        }

        return frequencyMap;

    }
}
