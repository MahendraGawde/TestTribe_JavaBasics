package interviewPreparation;// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.InputMismatchException;
import java.util.Scanner;

class Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = 0;
        boolean validInput = false;

        while(!validInput){
            try{
                System.out.print("Enter number to reverse: ");
                num = input.nextInt();
                validInput = true; //if input is valid then exit loop
            }catch(InputMismatchException e){
                System.out.println("Invalid input! Please enter a valid integer.");
                input.next(); //clear the invalid input.
            }
        }
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