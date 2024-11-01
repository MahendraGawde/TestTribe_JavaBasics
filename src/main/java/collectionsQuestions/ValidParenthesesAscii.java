package collectionsQuestions;

import java.util.Stack;

public class ValidParenthesesAscii {
    public static void main(String[] args) {
        String input = "[{})";  // Change this string to test different cases
        if (isValid(input)) {
            System.out.println("The parentheses are valid.");
        } else {
            System.out.println("The parentheses are not valid.");
        }
    }
    public static boolean isValid(String s){
        char[] arr = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for(char ch : arr){
            if(stack.isEmpty()){
                stack.push(ch);
            }else{
                char top = stack.peek();
                if(ch - top == 1 || ch - top ==2){
                    stack.pop();
                }else{
                    stack.push(ch);
                }
            }
        }
        return stack.isEmpty();
    }
}
