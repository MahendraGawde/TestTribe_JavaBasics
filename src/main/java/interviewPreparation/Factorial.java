package interviewPreparation;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Welcome to Factorial !");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number: ");
        int num = input.nextInt();
        long fact = factorial(num);
        System.out.println("Factorial of " +num + " : " +fact);

    }

    public static long factorial(int num){
        if(num<2){
            return 1;
        }
        long fact =1;
        int i=2; // initialization
        while(i <= num){ //Condition
            fact *= i;
            i++; // increment
        }
        return fact;
    }
}
