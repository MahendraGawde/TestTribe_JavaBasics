package interviewPreparation;

import java.util.Scanner;

public class PalindromeExample {
    public static void main(String[] args) {

        StringBuilder reverseStr = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input string to reverse: ");
        String originalStr = sc.nextLine();

        for (int i = originalStr.length()-1; i >=0 ; i--) {

            reverseStr.append(originalStr.charAt(i));

        }

        if(originalStr.contentEquals(reverseStr)){
            System.out.println("Given string is palindrome");
        }else {
            System.out.println("Given string is not a palindrome");
        }
        sc.close();

    }

}
