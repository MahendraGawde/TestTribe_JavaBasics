package interviewPreparation;

import java.util.Scanner;

public class CompoundInterest {

    //Compound Interest formula = principle * (1+rate/100)time
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Compound interest calculator: \n");
        System.out.print("Please enter principle amount in Rs: ");
        float principle = sc.nextFloat();
        System.out.print("Please enter rate of interest: ");
        float rate = sc.nextFloat();
        System.out.print("Please enter for how many years you want to borrow: ");
        float time = sc.nextFloat();

        double compoundInt = principle * Math.pow((1 + rate/100),time);

        System.out.println("Your Compound Interest in Rs: " +compoundInt);
    }
}
