package interviewPreparation;

public class FilterAlphabetsAndDigits {
    public static void main(String[] args) {
        String str = "#$%^&*1234%^^&  Inter.... View&^&^";

        // Use a regular expression to retain only alphabets and digits
        String result = str.replaceAll("[^a-zA-Z0-9]", "");

        System.out.println("Output: " + result);
    }
}