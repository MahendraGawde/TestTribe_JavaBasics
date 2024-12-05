package interviewPreparation;

public class ReplaceFirstOccurence {
    public static void main(String[] args) {
        String input = "I love pizza. I eat pizza every day. I make my own pizza.";
        String result = input.replaceFirst("pizza","donut");
        System.out.println("Output: " +result);
    }
}
