package collectionsQuestions;

import java.util.Stack;

public class ValidParentheses{
    public static void main(String[] args) {
        String input = "}";  // Change this string to test different cases
        if (isValid(input)) {
            System.out.println("The parentheses are valid.");
        } else {
            System.out.println("The parentheses are not valid.");
        }
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            // Push opening parentheses onto the stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            // Check for closing parentheses
            else if (ch == ')' || ch == '}' || ch == ']') {
                // If the stack is empty, there is no matching opening parenthesis
                if (stack.isEmpty()) {
                    return false;
                }
                // Check for matching pairs
                char top = stack.pop();
                if (!isMatchingPair(top, ch)) {
                    return false;
                }
            }
        }

        // If the stack is empty, all parentheses are matched
        return stack.isEmpty();
    }

    // Method to check if the opening and closing parentheses match
    private static boolean isMatchingPair(char opening, char closing) {
        return (opening == '(' && closing == ')') ||
                (opening == '{' && closing == '}') ||
                (opening == '[' && closing == ']');
    }
}

