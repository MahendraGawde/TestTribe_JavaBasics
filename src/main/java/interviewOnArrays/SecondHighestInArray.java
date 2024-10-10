package interviewOnArrays;

public class SecondHighestInArray {
    public static void main(String[] args) {
        int[] arr = {2,3,6,9,7,12};
        try {
            int secondHighest = findSecondHighest(arr);
            System.out.println("Second Highest number in array is: " +secondHighest);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int findSecondHighest(int[] arr){
        if(arr.length < 2){
            throw new IllegalArgumentException("Array must contain at least 2 elements");
        }
        int highest = Integer.MIN_VALUE;
        int secondHighest =Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > highest) {
                secondHighest = highest;
                highest = num;
            } else if (num > secondHighest && num != highest) {
                secondHighest = num;
            }
        }
            if(secondHighest == Integer.MIN_VALUE){
                throw new IllegalArgumentException("There is no second highest element in array.");
            }
            return secondHighest;
        }

}
