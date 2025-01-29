package interviewOnArrays;

import java.util.HashSet;

public class MissingNumberInArrayUsingSet {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 5, 6, 2, 3, 1};
        int missingNumber = findMissingNum(arr);
        System.out.println("Missing number in array: " +missingNumber);
    }

    private static int findMissingNum(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        int max = 0;

        for(int num: arr){
            set.add(num);
            max = Math.max(max,num);
        }

        for (int i = 1; i <= max ; i++) {
            if(!set.contains(i)){
                return i;
            }
        }
        return -1;
    }
}
