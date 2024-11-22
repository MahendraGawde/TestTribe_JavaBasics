package interviewOnArrays;

import java.util.Arrays;

public class MoveZerosToLeft {
    public static void main(String[] args) {
        //7,0,0,3,0,2,5,3,50,4,0,0

        int[] numbers = {7,0,0,3,0,2,5,3,50,4,0,0};
        moveZerostoLeft(numbers);
        System.out.println("Numbers array after moving zeros: " + Arrays.toString(numbers));

    }

    private static void moveZerostoLeft(int[] arr) {

        int n = arr.length;
        // Pointer to keep track of where non-zero numbers should go
        int nonZeroIndex = n-1;

        // Traverse the array from the rightmost element to the leftmost
        for(int i = n-1; i >=0; i--){
            if(arr[i] != 0){
                arr[nonZeroIndex] = arr[i];
                nonZeroIndex--;

            }
        }

        // Fill the remaining left side of the array with zeros
        while(nonZeroIndex >= 0){
            arr[nonZeroIndex] = 0;
            nonZeroIndex--;
        }
    }
}

