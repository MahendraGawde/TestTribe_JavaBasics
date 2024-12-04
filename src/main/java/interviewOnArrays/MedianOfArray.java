package interviewOnArrays;

import java.util.Scanner;
import java.util.Arrays;

public class MedianOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for first array
        int[] nums1 = inputArray(scanner, "first");

        // Input for second array
        int[] nums2 = inputArray(scanner, "second");

        // Merge arrays
        int[] mergedArr = merge(nums1, nums2);

        System.out.println("Merged Array: " + Arrays.toString(mergedArr));
        System.out.println("Median: " + findMedian(mergedArr));

        scanner.close();
    }
    public static int[] inputArray(Scanner scanner, String arrayName) {
        System.out.print("Enter the number of elements for the " + arrayName + " array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements for the " + arrayName + " array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    // Method to merge two sorted arrays
    public static int[] merge(int[] arr1, int[] arr2) {
        int[] newArr = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        while (i < arr1.length || j < arr2.length) {
            if(j==arr2.length || (i< arr1.length && arr1[i]< arr2[j])){
                newArr[k] = arr1[i];
                i++;
                k++;
            }else{
                newArr[k] = arr2[j];
                j++;
                k++;
            }
        }

        return newArr;
    }

    // Method to find the median of the merged array
    public static double findMedian(int[] arr) {
        int n = arr.length;
        if( n%2 == 1){
            return arr[n/2];
        }else{
            return(arr[n/2-1] +arr[n/2]) / 2.0;
        }
    }
}
