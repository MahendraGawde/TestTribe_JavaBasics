package interviewOnArrays;

public class MissingFibonacci {
    public static void main(String[] args) {
        // Input array with one missing number
        int[] arr = {1, 1, 2, 3, 8}; // Missing 5

        // Find the missing number
        int missingNumber = -1;
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] != arr[i - 1] + arr[i - 2]) {
                missingNumber = arr[i - 1] + arr[i - 2];
                break;
            }
        }

        // Output the missing number
        System.out.println("The missing number is: " + missingNumber);
    }
}
