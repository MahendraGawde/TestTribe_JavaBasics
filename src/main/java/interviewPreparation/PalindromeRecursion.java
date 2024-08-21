package interviewPreparation;

import java.util.Scanner;

public class PalindromeRecursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to palindrome checker!!");
        System.out.print("Enter string to be checked: ");
        String str = input.next();
        System.out.println("Your string is " +((isPalindrome(str)) ? "Palindrome": "not a Palindrome" ));
    }

    public static boolean isPalindrome(String str){
        if(str.length() <= 1){
            return true;
        }
        int lastPos = str.length()-1;
        if(str.charAt(0) != str.charAt(lastPos)){
            return false;
        }
        String newStr = str.substring(1,lastPos);
        return isPalindrome(newStr);
    }
}