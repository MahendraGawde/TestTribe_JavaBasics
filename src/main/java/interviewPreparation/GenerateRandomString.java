package interviewPreparation;

import java.util.Random;
import java.util.Scanner;

public class GenerateRandomString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length of characters to generate random string: " );
        int length= input.nextInt();


//        int length = 8;
        String randomAlphaNumString = generateRandomString(length);
        System.out.println("Random alphanumeric string generated: " +randomAlphaNumString);
    }

    private static String generateRandomString(int length) {
        if(length <= 6 || length >=100){
            throw new IllegalArgumentException("Length of characters must be more than 6 and less than 100");
        }

        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder result = new StringBuilder(length);

        Random random = new Random();

        for (int i = 0; i < length ; i++) {
            int index = random.nextInt(characters.length());
            result.append(characters.charAt(index));
        }
        return result.toString();

    }
}
