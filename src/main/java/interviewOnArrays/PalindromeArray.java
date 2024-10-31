package interviewOnArrays;
import utils.ArrayUtils;
public class PalindromeArray {
    public static void main(String[] args) {
        int[] arr = ArrayUtils.inputArray();
        boolean isPalin = isPalindrome(arr);
        if(isPalin){
            System.out.println("Your array is palindrome");
        }else{
            System.out.println("Your array is not palindrome");
        }
    }

    private static boolean isPalindrome(int[] numArr) {
        if(numArr.length < 2){
            System.out.println("Array must contain more than 1 number");
            return false;
        }
        int i = 0;

        while(i<numArr.length/2){

            if(numArr[i] != numArr[numArr.length -1 -i]){
                return false;
            }
            i++;
        }
        return true;

    }
}
