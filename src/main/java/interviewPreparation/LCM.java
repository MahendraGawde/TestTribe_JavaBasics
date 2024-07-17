package interviewPreparation;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        int first = input.nextInt();
        System.out.println("Enter second number");
        int second = input.nextInt();

        int lcm = lcm(first,second);
        System.out.println("LCM of numbers: " +lcm);
    }

    public static int lcm(int first, int second){
        int i = 1;
        while(true){
            int factor = first *i;
            if(factor % second == 0){
                return factor;
            }
            i++;
        }


    }
}
