package interviewPreparation;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        int gcd;

        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter first number: ");
            int num1 = input.nextInt();
            System.out.println("Enter second number: ");
            int num2 = input.nextInt();

            gcd = findGCD(num1, num2);
            System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter integer values.");
        }
    }

    private static int findGCD(int a, int b) {
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a; // When b becomes 0, a is the GCD
    }

}
