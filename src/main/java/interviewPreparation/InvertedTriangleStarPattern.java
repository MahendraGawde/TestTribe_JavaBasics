package interviewPreparation;

import java.util.Scanner;

public class InvertedTriangleStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows for the inverted pyramid:");
        int rows = sc.nextInt();
        invertedTrianglePattern(rows);
        sc.close();
    }

    public static void invertedTrianglePattern(int maxRows) {
        for (int i = maxRows; i >= 1; i--) {
            // Print leading spaces
            for (int j = maxRows; j > i; j--) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
