package interviewPreparation;

public class FilterAlphabetsAndDigitsWithoutRegex {
    public static void main(String[] args) {
        String str = "#$%^&*1234%^^&  Inter.... View&^&^";
        StringBuilder result = new StringBuilder();

        // Iterate through each character in the string
        for (char ch : str.toCharArray()) {
            // Check if the character is a letter or digit
            if (Character.isLetter(ch) || Character.isDigit(ch)) {
                result.append(ch);
            }
        }

        System.out.println("Output: " + result);
    }
}
