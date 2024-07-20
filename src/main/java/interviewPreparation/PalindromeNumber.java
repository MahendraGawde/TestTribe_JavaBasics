package interviewPreparation;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("Welcome to Palindrome checker!!");
        System.out.println("Enter number to check palindrome: ");
        int num = input.nextInt();
        boolean isPalindrome =isPalindrome(num);
        if(isPalindrome){
            System.out.println("Number is Palindrome:");
        }else {
            System.out.println("Number is not palindrome");
        }
        input.close();
    }

    public static int reverseDigit(int num){
        int newNum = 0;
        while(num > 0){
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num /= 10;

        }
        return newNum;
    }

    public static boolean isPalindrome(int num){
        return num == reverseDigit(num);
    }
}
