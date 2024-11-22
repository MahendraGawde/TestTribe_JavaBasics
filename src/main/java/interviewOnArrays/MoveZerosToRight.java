package interviewOnArrays;

import java.util.Arrays;

public class MoveZerosToRight {
    public static void main(String[] args) {
        int[] values = {2, 0, 3, 0, 4, 5, 0, 77, 88, 0, 99, 0, 603, 607};

        // Call the method to move zeros
        moveZerosToRight(values);

        // Print the modified array
        System.out.println(Arrays.toString(values));
    }

    private static void moveZerosToRight(int[] arr) {
        int nonZeroIndex = 0; // Tracks the position for the next non-zero element

        // Traverse the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[nonZeroIndex] = arr[i];
                nonZeroIndex++;
            }
        }

        // Fill the remaining elements with zeros
        while (nonZeroIndex < arr.length) {
            arr[nonZeroIndex] = 0;
            nonZeroIndex++;
        }
    }
}
