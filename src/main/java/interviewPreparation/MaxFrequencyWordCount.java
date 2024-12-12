package interviewPreparation;

import java.util.HashMap;
import java.util.Map;

//String Bank="Bank1,Bank2,Bank3,Bank1,Bank1,Bank2,Bank5,Bank6,Bank7,Bank8,Bank1,Bank2,Bank9,Bank10,Bank1,Bank1,Bank2,Bank12,Bank1"
public class MaxFrequencyWordCount {
    public static void main(String[] args) {

        String bank="Bank1,Bank2,Bank3,Bank1,Bank1,Bank2,Bank5,Bank6,Bank7,Bank8,Bank1,Bank2,Bank9,Bank10,Bank1,Bank1,Bank2,Bank12,Bank1";

        String maxBank = null;
        int maxCount = 0;

        String[] banks = bank.split(",");
        Map<String,Integer> wordCount = new HashMap<>();
        for(String b : banks){
            wordCount.put(b,wordCount.getOrDefault(b,0) +1);
        }

        for(Map.Entry<String,Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxBank = entry.getKey();
            }
        }

            if (maxBank != null) {
                System.out.println(maxBank + " = " + maxCount);
            } else {
                System.out.println("No banks found.");
            }

        }

}




