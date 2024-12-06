package interviewPreparation;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class WordCountInString {
    public static void main(String[] args) {
        String sentence = "I'm trying to make a program on word count trying to make";
        Map<String, Integer> wordCounts = countWords(sentence);
        for(Map.Entry<String,Integer> entry: wordCounts.entrySet()){
            System.out.println("Word '" +entry.getKey()+ "' counts -> " +entry.getValue()+ " times");
        }
//        System.out.println(wordCounts);
    }

    private static Map<String, Integer> countWords(String sentence) {
        String[] words = sentence.split(" ");
        Map<String,Integer> wordCounts = new LinkedHashMap<>();
        for(String word : words){
            wordCounts.put(word,wordCounts.getOrDefault(word,0) +1);
        }
        return wordCounts;
    }
}
