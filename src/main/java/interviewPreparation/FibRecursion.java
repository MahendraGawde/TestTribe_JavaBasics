package interviewPreparation;

import java.util.Scanner;

public class FibRecursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to printing Fibonacci series!!");
        System.out.print("Enter the maximum number up to which Fibonacci series should be printed: ");
        int maxNumber = input.nextInt();

        int i = 0;
        int fib;

        System.out.println("Fibonacci Series up to " + maxNumber + ": ");
        while (true) {
            fib = fibonacci(i);
            if (fib > maxNumber) {
                break;
            }
            System.out.print(fib + " ");
            i++;
        }

        input.close();
    }

    public static int fibonacci(int position) {
        if (position == 0) {
            return 0;
        }
        if (position == 1) {
            return 1;
        }
        return fibonacci(position - 1) + fibonacci(position - 2);
    }
}
