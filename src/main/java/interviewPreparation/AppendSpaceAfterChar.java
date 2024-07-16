package interviewPreparation;

public class AppendSpaceAfterChar {

    public static void main(String[] args) {
        String str = "abc";
        String result = "";

        // Iterate through each character of the string
        for (int i = 0; i < str.length(); i++) {
            // Append the character to the result string
            result += str.charAt(i);

            // Append a space after each character, except the last one
            if (i != str.length() - 1) {
                result += " ";
            }
        }

        // Print the modified string
        System.out.println(result);
    }
}
