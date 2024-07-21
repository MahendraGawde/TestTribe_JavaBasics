package interviewPreparation;

import java.util.Scanner;

public class FibonacciRecursion {
    // Print fibonacci series  upto certain number using recursion
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to printing fibonacci series!!");
        System.out.print("Enter number of elements to be printed series: ");
        int count = input.nextInt();

        for (int i = 1; i <= count ; i++) {
            System.out.print(fibonacci(i) + " ");

        }

    }

    public static int fibonacci(int position){

        if(position == 1)
            return 0;
        if(position == 2){
            return 1;
        }
        return fibonacci(position-1) + fibonacci(position -2);



    }
}
