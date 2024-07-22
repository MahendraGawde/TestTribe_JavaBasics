package interviewPreparation;

import java.util.Scanner;

public class TableFormat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to print multiplication table: ");
        int num = input.nextInt();

        System.out.printf("Multiplication table of %d : \n", num);
        for (int i =1; i<=10; i++){
            System.out.printf("%d X %d = %d\n", num,i,num*i);
        }
        input.close();
    }
}
