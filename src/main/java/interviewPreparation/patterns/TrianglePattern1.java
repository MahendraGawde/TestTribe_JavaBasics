package interviewPreparation.patterns;

import java.util.Scanner;

public class TrianglePattern1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to triangle pattern!!");
        System.out.print("Please enter number of rows: ");
        int rows = input.nextInt();
        trianglePattern(rows);
    }

    public static void trianglePattern(int maxRows){
        int rows = 0;
        while(rows<maxRows){
            System.out.print("*");
            int i = 0;
            while(i < rows){
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows++;
        }
    }
}
