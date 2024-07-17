package interviewPreparation;

import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to prime check !");
        System.out.println("Please enter your number: ");
        int num = input.nextInt();
        boolean isPrime = isPrime(num);
         if (isPrime){
             System.out.println("Number is prime");
         }else {
             System.out.println("Number is not prime");
         }
    }

    public  static boolean isPrime(int num){

        if (num <= 1) {
            return false;
        }
        int i =2;
        while(i < num){
            if(num % i == 0){
                return false;
            }
            i++;
        }
        return true;
    }
}
