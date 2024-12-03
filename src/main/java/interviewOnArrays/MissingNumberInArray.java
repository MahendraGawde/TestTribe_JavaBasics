package interviewOnArrays;

public class MissingNumberInArray {
    public static void main(String[] args) {
        int[] numbers = {1,2,4,5,6};
        int n = numbers.length +1;
        int expectedSum = n *(n+1)/2;

        System.out.println(expectedSum);

        int sumOfArray = 0;
        for (int i = 0; i < numbers.length ; i++) {
            sumOfArray += numbers[i];
        }
        int missingNumber = expectedSum - sumOfArray;

        System.out.println("Missing number in array: " +missingNumber);
    }
}
