package interviewOnArrays;

public class SortArrayWithTemp {
    public static void main(String[] args) {
        int[] array = {44, 21, 3, 19, 25, 7, 5};

        // Bubble sort to sort the array in ascending order
        for (int i = 0; i <= array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j+1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        // Print the sorted array
        System.out.print("Sorted array in ascending order: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
