package interviewPreparation;

public class ReverseWords {
    public static void main(String[] args) {
        String input = "I am a good boy";
        String reversed = reverseWords(input);
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reversed);
    }

    public static String reverseWords(String str) {
        // Split the string by spaces to get individual words
        String[] words = str.split(" ");

        // Initialize an empty string to store the reversed string
        String reversed = "";

        // Traverse the array from the last word to the first
        for (int i = words.length - 1; i >= 0; i--) {
            // Concatenate each word to the result
            reversed += words[i];

            // Add a space after each word except for the last one
            if (i != 0) {
                reversed += " ";
            }
        }

        // Return the reversed string
        return reversed;
    }
}
