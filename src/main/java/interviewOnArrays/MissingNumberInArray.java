package interviewOnArrays;

public class MissingNumberInArray {
    public static void main(String[] args) {
        int[] numbers = {1,2,4,5,6};
        int totalArraySize = numbers.length +1;
        int sumOfNumbersInArray = (totalArraySize *(totalArraySize+1))/2;

        System.out.println(sumOfNumbersInArray);

        int sumOfArray = 0;
        for (int i = 0; i < numbers.length ; i++) {
            sumOfArray += numbers[i];
        }

        System.out.println("Missing number in array: " +(sumOfNumbersInArray-sumOfArray));
    }
}
