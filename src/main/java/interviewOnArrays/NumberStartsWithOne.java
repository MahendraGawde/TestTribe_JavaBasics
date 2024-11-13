package interviewOnArrays;

import java.util.ArrayList;
import java.util.List;

public class NumberStartsWithOne {
    public static void main(String[] args) {
        int[] arr = {11,124,34,45,78,322,19,1};
        System.out.println(getNumListWithOne(arr));
    }

    private static int getFirstDigit(int num){
        while(num>=10){
            num = num/10;
        }
        return num;
    }
    private static List<Integer> getNumListWithOne(int[] arr) {
        List<Integer> numbers = new ArrayList<>();
        for(int num : arr){
            int n = getFirstDigit(num);
            if(n == 1){
                numbers.add(num);
            }
        }
        return numbers;
    }
}
