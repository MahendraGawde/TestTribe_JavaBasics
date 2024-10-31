package utils;

import java.util.Scanner;

public class ArrayUtils {


    public static int[] inputArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter no. of elements: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        int i = 0;
        while (i < size) {
            System.out.printf("Please enter element %d: ", i + 1);
            arr[i] = input.nextInt();
            i++;
        }
        return arr;
    }
}
