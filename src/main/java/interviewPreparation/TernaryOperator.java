package interviewPreparation;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to ternary operator!!");
        System.out.print("Please enter num1: ");
        int num1 = input.nextInt();
        System.out.print("Please enter num2: ");
        int num2 = input.nextInt();

      /* int max_number;
        if(num1 > num2){
            max_number = num1;
        }else {
            max_number = num2;
        }*/
//      Using Ternary operator without using If-Else
        int max_number = num1 > num2 ? num1 : num2;

        System.out.println(max_number+ " is greatest number");

    }
}
