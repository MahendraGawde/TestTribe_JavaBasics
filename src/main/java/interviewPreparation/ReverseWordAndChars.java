package interviewPreparation;

public class ReverseWordAndChars {
    public static void main(String[] args) {
        String input = "Hello World";
        //Output = dlroW olleH
        String result = reverseWordAndChars(input);
        System.out.println("Original String: " +input);
        System.out.println("Reversed word and characters: " +result);
    }

    private static String reverseWordAndChars(String input) {
        String[] words = input.split(" ");
        StringBuilder reversedString = new StringBuilder();

        for (int i = words.length-1; i >=0 ; i--) {
            StringBuilder reversedWords = new StringBuilder(words[i]).reverse();
            reversedString.append(reversedWords).append(" ");
        }
        return reversedString.toString().trim();

    }
}
