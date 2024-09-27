package interviewOnArrays;

public class ArraysSortedCheck {

    public static void main(String[] args) {
        int[] numArr = {1,2,3,4,-7};
        boolean isInc = isIncreasing(numArr);
        boolean isDec = isDecreasing(numArr);
        if(isInc || isDec ){
            System.out.println("Your array is sorted");
        }else{
            System.out.println("Your array is not sorted");
        }
    }

    private static boolean isDecreasing(int[] numArr) {
        int i = 1;
        while(i<numArr.length){
            if(numArr[i] > numArr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }

    private static boolean isIncreasing(int[] numArr) {
        int i = 1;
        while(i<numArr.length){
            if(numArr[i] < numArr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
}
