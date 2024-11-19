package interviewOnArrays;

public class SecondHighestWithoutMinValue {
    public static void main(String[] args) {
        int[] numbers = {3, 3, 7, 1, 4, 9, 2}; // Sample array
        findSecondHighest(numbers);
    }

    public static void findSecondHighest(int[] array) {
        if (array == null || array.length < 2) {
            System.out.println("Array must have at least two elements.");
            return;
        }

        // Initialize highest and secondHighest to the first two elements
        int highest = Math.max(array[0], array[1]);
        int secondHighest = Math.min(array[0], array[1]);

        // Loop through the rest of the array
        for (int i = 2; i < array.length; i++) {
            if (array[i] > highest) {
                secondHighest = highest;
                highest = array[i];
            } else if (array[i] > secondHighest && array[i] != highest) {
                secondHighest = array[i];
            }
        }

        System.out.println("Second highest number is: " + secondHighest);
    }
}

