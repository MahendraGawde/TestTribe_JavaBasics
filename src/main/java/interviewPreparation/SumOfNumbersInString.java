package interviewPreparation;

public class SumOfNumbersInString {
    public static void main(String[] args) {
        String input = "33asdef 35sfs 34 wdsf";
        System.out.println("Sum of numbers in the string: " + calculateSum(input));
    }

    private static int calculateSum(String str) {
        int sum = 0;
        String[] parts = str.split("\\D");
        for(String part : parts){
            if(!part.isEmpty()){
                sum += Integer.parseInt(part);
            }
        }
        return sum;
    }
}
