package interviewPreparation;

public class SumOfDigitsInString {
    public static void main(String[] args) {
        String input = "mahendra123test789new2check560101";
        System.out.println("Welcome to add all digits in string program: ");

        int sum = 0;
        for(char ch: input.toCharArray()){
            if(Character.isDigit(ch)){
                sum += Character.getNumericValue(ch);
            }
        }
        System.out.println("Sum of digits in input string is: " +sum);
    }
}
