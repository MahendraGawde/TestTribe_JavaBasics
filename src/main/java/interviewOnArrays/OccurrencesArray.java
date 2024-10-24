package interviewOnArrays;

import java.util.Scanner;

public class OccurrencesArray {
    public static void main(String[] args) {
        int[] numArray = {1,2,2,3,4,5};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number to be found in array: ");
        int num = input.nextInt();
        int occurences = noOfOccurrences(numArray,num);
        System.out.println("Number found " +occurences+ " times in array");
    }

    public static int noOfOccurrences(int[] numArray, int num){
        int occ = 0;
        int i = 0;
        while(i< numArray.length){
            if(numArray[i] == num){
                occ++;
            }
            i++;
        }
        return occ;
    }
}
