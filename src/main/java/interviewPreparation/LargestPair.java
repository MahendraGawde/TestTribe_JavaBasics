package interviewPreparation;

public class LargestPair {
    public static void main(String[] args) {
        System.out.println(largestPair(4759472)); // Output: 94
        System.out.println(largestPair(12345));   // Output: 45
        System.out.println(largestPair(98765));   // Output: 98
        System.out.println(largestPair(10101));   // Output: 10
    }

    private static int largestPair(int num) {

        String numStr = String.valueOf(num);
        int largest = 0;
        for (int i = 0; i < numStr.length()-1 ; i++) {
            int pair = Integer.parseInt(numStr.substring(i,i+2));
            if(pair > largest){
                largest =pair;
            }
        }
        return largest;
    }
}
