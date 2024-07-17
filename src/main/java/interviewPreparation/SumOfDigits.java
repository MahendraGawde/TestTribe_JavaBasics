package interviewPreparation;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to sum of digits !");
        System.out.println("Please enter number: ");
        int num = input.nextInt();
        int sum = sumOfDigits(num);
        System.out.println("Sum of digits: " +sum);
        input.close();
    }

    private static int sumOfDigits(int num) {
        int sum = 0;
        while(num > 0){
            sum = sum + (num%10);
            num = num/10;
        }
        return sum;
    }
}
