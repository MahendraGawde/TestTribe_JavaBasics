package interviewOnArrays;

import utils.ArrayUtils;

public class MergedSortedArray {
    public static void main(String[] args) {
        int[] arr1 = ArrayUtils.inputArray();
        int[] arr2 = ArrayUtils.inputArray();
        int[] mergedArr = merge(arr1,arr2);
        System.out.println("Your merged array is: ");
        for(int ele : mergedArr){
            System.out.print(ele + "\t");
        }
    }

    private static int[] merge(int[] arr1, int[] arr2) {
        int newSize = arr1.length + arr2.length;
        int[] newArr = new int[newSize];
        int i = 0, j=0, k=0;
        while(i < arr1.length || j < arr2.length){
            if(j == arr2.length || (i < arr1.length && arr1[i] < arr2[j])){
                newArr[k] = arr1[i];
                i++;
                k++;
            }else{
                newArr[k] = arr2[j];
                j++;
                k++;
            }
        }
        return newArr;
    }
}
