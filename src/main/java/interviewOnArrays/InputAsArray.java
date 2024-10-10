package interviewOnArrays;

import java.util.Scanner;

public class InputAsArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();

        int[] intArray = new int[n];
        System.out.println("Enter numbers to add: ");
        for (int i = 0; i < n ; i++) {
            intArray[i] = sc.nextInt();
        }

        System.out.println("Output -> ");

        for (int i = 0; i <n ; i++) {
            System.out.println(intArray[i]);
        }
        sc.close();
    }
}
