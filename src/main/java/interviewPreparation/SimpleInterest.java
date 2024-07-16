package interviewPreparation;

import java.util.Scanner;

public class SimpleInterest {

    // Simple interest = (principle * time * rate)/100

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Simple interest calculator: \n");
        System.out.print("Please enter principle amount in Rs: ");
        float principle = sc.nextFloat();
        System.out.print("Please enter rate of interest: ");
        float rate = sc.nextFloat();
        System.out.print("Please enter for how many years you want to borrow: ");
        float time = sc.nextFloat();

        float simpleInterest = (principle * rate * time)/100;

        System.out.println("Your simple interest calculated as: " +simpleInterest);
    }
}
