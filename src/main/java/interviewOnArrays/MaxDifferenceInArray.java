package interviewOnArrays;

public class MaxDifferenceInArray {
    public static void main(String[] args) {
        int[] arr = {23, 67, 1, 6, 97, 21, 7};
        int result = findMaxDifference(arr);
        System.out.println("The maximum difference is: " + result);
    }

    public static int findMaxDifference(int[] arr) {
        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements.");
        }

        int minElement = arr[0];  // Initialize the first element as the minimum
        int maxDifference = Integer.MIN_VALUE;  // Start with the smallest possible value for maxDifference

        // Traverse the array starting from the second element
        for (int i = 1; i < arr.length; i++) {
            // Calculate the difference between current element and minimum element seen so far
            maxDifference = Math.max(maxDifference, arr[i] - minElement);

            // Update the minimum element encountered
            minElement = Math.min(minElement, arr[i]);
        }

        return maxDifference;
    }
}
