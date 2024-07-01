package interviewPreparation;

public class SwapStrings {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "xyz";

        System.out.println("Before swapping:");
        System.out.println("String1 = " + str1);
        System.out.println("String2 = " + str2);

        // Concatenate str1 and str2 and assign it to str1
        str1 = str1 + str2;

        // Extract the original str2 from the concatenated string and assign it to str1
        str2 = str1.substring(0, str1.length() - str2.length());

        // Extract the original str1 from the concatenated string and assign it to str2
        str1 = str1.substring(str2.length());

        System.out.println("After swapping:");
        System.out.println("String1 = " + str1);
        System.out.println("String2 = " + str2);
    }
}
