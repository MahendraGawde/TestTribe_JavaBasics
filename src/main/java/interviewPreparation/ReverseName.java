package interviewPreparation;

public class ReverseName {
    public static void main(String[] args) {
        String name = "Rishi";
        char[] charArr = name.toCharArray();
        int left = 0;
        int right = charArr.length-1;

        while(left<right){
            char temp = charArr[left];
            charArr[left] = charArr[right];
            charArr[right] = temp;
            left++;
            right--;
        }
        System.out.println(new String(charArr));
    }
}
