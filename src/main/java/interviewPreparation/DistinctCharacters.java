package interviewPreparation;

import java.util.HashSet;
import java.util.Set;

public class DistinctCharacters {
    public static void main(String[] args) {
        // Test cases
        System.out.println(distinctChars("abcdefghij")); // true
        System.out.println(distinctChars("aabbccddeeff")); // false
        System.out.println(distinctChars("12345abcde")); // true
        System.out.println(distinctChars("abc")); // false
    }
    public static String distinctChars(String str){
        if(str == null || str.length() <10){
            return "false";
        }
        Set<Character> uniqueChars = new HashSet<>();

        for(char ch : str.toCharArray()){
            uniqueChars.add(ch);
            if(uniqueChars.size()>=10){
                return "true";
            }
        }
        return "false";
    }
}
