package interviewPreparation;

public class Practice{
    public static void main(String[] args) {
        int[] arr = {2};
        int result = findMaxDiff(arr);
        System.out.println("Max difference in array is: " +result);

    }

    private static int findMaxDiff(int[] arr) {

        if(arr == null || arr.length <2){
            throw new IllegalArgumentException("Array must contain more than 2 numbers");
        }
        int minElement = arr[0];
        int maxDifference = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length ; i++) {
            maxDifference = Math.max(maxDifference,arr[i] - minElement);

            minElement = Math.min(minElement, arr[i]);

        }
        return maxDifference;
    }
}
