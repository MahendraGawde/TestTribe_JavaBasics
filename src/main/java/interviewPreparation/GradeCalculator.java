package interviewPreparation;

import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Grade calculator: \n");
        System.out.print("Please enter your percentage: ");
        float percentage = input.nextFloat();

        if(percentage >= 90){
            System.out.println("You got A");
        } else if (percentage >= 75 ) {
            System.out.println("You got B");
        }else if (percentage >= 60){
            System.out.println("You got C");
        }else if(percentage >= 35){
            System.out.println("You got D");
        }else {
            System.out.println("You failed");
        }
    }
}
