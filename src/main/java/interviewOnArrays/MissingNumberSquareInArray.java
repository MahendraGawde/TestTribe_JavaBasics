package interviewOnArrays;

public class MissingNumberSquareInArray {
    public static void main(String[] args) {
        int[] arr = {1,4,9,25};
        int missingNumber = findMissingNumber(arr);
        System.out.println("Missing number is: " +missingNumber);

    }

    public static int findMissingNumber(int[] arr){
        int expectedNo = 1;
        int index = 0;

        while(index < arr.length){
            int square = expectedNo * expectedNo;

            if(arr[index] != square){
                // If the current array value doesn't match the expected square, return the square
                return square;
            }
            // Move to the next number and array index
            expectedNo++;
            index++;
        }
        // If no missing number was found in the loop, calculate the next expected square
        return expectedNo * expectedNo;
    }
}
