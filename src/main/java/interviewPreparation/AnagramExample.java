package interviewPreparation;


import java.util.Arrays;

public class AnagramExample {

    //Anagram - Two Strings are anagram if they contain same characters but in different order.
    public static boolean isAnagram(String str1, String str2){
        str1 = str1.toLowerCase().replace(" ", "");
        str2 = str2.toLowerCase().replace(" ", "");

        char[] charArrStr1 = str1.toCharArray();
        char[] charArrStr2 = str2.toCharArray();

        if(charArrStr1.length != charArrStr2.length){
            return false;
        }

        Arrays.sort(charArrStr1);
        Arrays.sort(charArrStr2);
        return Arrays.equals(charArrStr1, charArrStr2);
    }
    public static void main(String[] args) {

        String str1 = "Mother in Law";
        String str2 = "Hitler Woman";

        System.out.println("Both strings are anagram: " +isAnagram(str1,str2));

    }
}
