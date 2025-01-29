package interviewOnArrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MissingMultipleNumbers {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};

        List<Integer> missingNumbers = findMissingNums(arr);
        System.out.println("Missing numbers: " +missingNumbers);
    }

    private static List<Integer> findMissingNums(int[] arr) {

        List<Integer> missingNumbers = new ArrayList<>();

        // Step 1: Determine the maximum number in the array to decide the range
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        // Step 2: Create a set to store unique numbers
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num); // Add unique numbers to the set
        }

        // Step 3: Find missing numbers in the range 1 to max
        for (int i = 1; i <= max; i++) {
            if (!set.contains(i)) {
                missingNumbers.add(i);
            }
        }

        return missingNumbers;

    }


}
