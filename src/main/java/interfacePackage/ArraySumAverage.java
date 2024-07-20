package interfacePackage;

import java.util.Scanner;

public class ArraySumAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Array Sum and average program!!");
        System.out.println("Please enter number of elements: ");
        int size = input.nextInt();
        int[] nums = new int[size];
        int i = 0;

        while (i < size){
            System.out.println("Please enter element no." +(i+1)+ ": ");
            nums[i] = input.nextInt();
            i++;
        }

        int[] numArray = nums;
        long sum = sum(numArray);
        double avg = average(numArray);

        System.out.println("Sum of numbers in array is: " +sum);
        System.out.println("Average of numbers in array is: " +avg);


    }
    public static long sum(int[] numArray){
        long sum = 0;
        int i = 0;
        while(i < numArray.length){
            sum += numArray[i];
            i++;
        }
        return sum;
    }

    public static double average(int[] numArray){
        double sum = sum(numArray);
        return (sum/numArray.length);
    }
}
