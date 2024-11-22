package interviewOnArrays;

import java.util.Arrays;
/*
Write a program to sort numbers and reverse the characters and eliminate all special characters
Input :"!4@T#6S%1E*9T"
Output : “TEST 1469"
*/

public class SortAndReverse {
    public static void main(String[] args) {
        String input = "!4@T#6S%1E*9T";

        // Separate characters and digits, ignore special characters
        StringBuilder letters = new StringBuilder();
        StringBuilder numbers = new StringBuilder();

        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                letters.append(ch);
            } else if (Character.isDigit(ch)) {
                numbers.append(ch);
            }
        }

        // Sort the digits and characters as needed
        char[] sortedNumbers = numbers.toString().toCharArray();
        Arrays.sort(sortedNumbers);

        // Convert letters to uppercase and reverse order
        String reversedLetters = letters.reverse().toString().toUpperCase();

        // Print result in desired format
        String result = reversedLetters + " " + new String(sortedNumbers);
        System.out.println(result);  // Output: TEST 1469
    }
}