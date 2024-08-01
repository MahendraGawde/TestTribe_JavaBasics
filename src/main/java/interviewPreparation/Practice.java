package interviewPreparation;// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

class Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number to reverse: ");
        int num = input.nextInt();
        System.out.println("Reverse of " +num+ " is " +reverse(num));

    }

    public static int reverse(int num){

        int newNum = 0;

        while(num > 0){
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num /= 10;
        }
        return newNum;
    }
}