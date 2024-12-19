package interviewPreparation;

public class    ReverseEachWord {
    public static void main(String[] args) {
        String input = "Hello World from ChatGPT";
        //Output = olleH dlroW morf TPGtahC
        String reversedString = reverseEachWord(input);
        System.out.println("Reversed String: " + reversedString);
    }

    public static String reverseEachWord(String str) {
        // Split the string by spaces
        String[] words = str.split(" ");
        StringBuilder reversed = new StringBuilder();

        // Reverse each word and append it to the result
        for (String word : words) {
            StringBuilder reverseWord = new StringBuilder(word);
            reversed.append(reverseWord.reverse()).append(" ");
        }

        // Convert StringBuilder to String and trim any extra spaces
        return reversed.toString().trim();
    }
}

