package interviewOnArrays;

public class MissingNumberInArithmeticProgression {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 10, 12};

        // Find the common difference (assume it's consistent for the sequence)
        int diff = (arr[arr.length - 1] - arr[0]) / arr.length;

        // Find the missing number
        int missingNumber = -1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] != diff) {
                missingNumber = arr[i] + diff;
                break;
            }
        }

        // Output the missing number
        System.out.println("The missing number is: " + missingNumber);
    }
}
