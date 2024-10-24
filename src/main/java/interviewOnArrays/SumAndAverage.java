package interviewOnArrays;

public class SumAndAverage {
    public static void main(String[] args) {
        int[] numArray = {2,3,4,5,6,7};
        long sum = sum(numArray);
        double avg = avg(numArray);
        System.out.println("Sum of nums : "+sum);
        System.out.println("Avg of nums : "+avg);
    }

    public static long sum(int[] numArray){
        long sum = 0;
        int i = 0;
        while(i<numArray.length){
            sum += numArray[i];
            i++;
        }
        return sum;
    }
    public static double avg(int[] numArray){
            double sum = sum(numArray);
            return (sum/numArray.length);
    }
}
