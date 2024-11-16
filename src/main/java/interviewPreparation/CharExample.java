package interviewPreparation;

import java.util.HashMap;
import java.util.Map;

public class CharExample{

    public static void main(String args[]) {
        String str1 = "Hello";
        String str2 = "World";

        System.out.println("Before Swap:");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);

        // Swapping strings using StringBuilder
        StringBuilder sb = new StringBuilder(str1);
        sb.append(str2);

        // Extract str2 from concatenated string
        str1 = sb.substring(str1.length());

        // Extract str1 from concatenated string
        str2 = sb.substring(0, sb.length() - str1.length());

        System.out.println("\nAfter Swap:");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);

        /*String firstString = "hello";
        String secondString = "world";

        StringBuilder sb = new StringBuilder(firstString);
        sb.append(secondString);
        System.out.println(sb);

        secondString = sb.substring(0,firstString.length());
        firstString = sb.substring(secondString.length());

        System.out.println(firstString);
        System.out.println(secondString);*/
        }
    }


