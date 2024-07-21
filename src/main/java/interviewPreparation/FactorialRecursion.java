package interviewPreparation;

import java.util.Scanner;

public class FactorialRecursion {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Factorial program!!");
        System.out.print("Please Enter your number: ");
        int num = input.nextInt();
        long fact = factorial(num);
        System.out.println("Factorial of number "+num+ ": " +fact);
    }

    public static long factorial(int num){
        if(num == 1 || num ==0){
            return 1;
        }
        return num * factorial(num -1);
    }
    public static long factorialIterative(int num){
        long result = 1;
        for (int i = 1; i <= num ; i++) {
            result *= i;
        }
        return result;
    }

}
