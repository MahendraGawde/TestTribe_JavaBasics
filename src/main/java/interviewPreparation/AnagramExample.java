package interviewPreparation;

import java.util.Arrays;

public class AnagramExample {

    //Anagram - Two Strings are anagram if they contain same characters but in different order.
    public static boolean isAnagram(String str1, String str2){
        char[] charArrFromString1 = str1.toCharArray();
        char[] charArrFromString2 = str2.toCharArray();
        Arrays.sort(charArrFromString1);
        Arrays.sort(charArrFromString2);
        return Arrays.equals(charArrFromString1, charArrFromString2);
    }
    public static void main(String[] args) {

        String str1 = "java";
        String str2 = "mava";

        System.out.println("Both strings are anagram: " +isAnagram(str1,str2));

    }
}
